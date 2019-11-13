package com.futureeducation.commonmodule.application

import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.apkfuns.logutils.LogLevel
import com.apkfuns.logutils.LogUtils
import com.billy.cc.core.component.CC
import com.futureeducation.commonmodule.config.CommonConfig
import com.futureeducation.commonmodule.constants.CommonConstants
import com.futureeducation.commonmodule.http.LoginInterceptor
import com.futureeducation.commonmodule.http.converter.JsonConverter
import com.yanzhenjie.kalle.Kalle
import com.yanzhenjie.kalle.KalleConfig
import com.yanzhenjie.kalle.connect.BroadcastNetwork
import com.yanzhenjie.kalle.connect.http.LoggerInterceptor

import com.yanzhenjie.kalle.cookie.DBCookieStore
import com.yanzhenjie.kalle.simple.cache.DiskCacheStore
import com.yanzhenjie.kalle.urlconnect.URLConnectionFactory
import me.jessyan.autosize.AutoSize
import me.jessyan.autosize.AutoSizeConfig
import me.jessyan.autosize.external.ExternalAdaptInfo
import me.jessyan.autosize.external.ExternalAdaptManager
import me.jessyan.autosize.internal.CustomAdapt
import me.jessyan.autosize.onAdaptListener
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * Created by CommonApplication.
 * User: ASUS
 * Date: 2019/11/12
 * Time: 13:26
 * 创建程序application
 */
open class CommonApplication : Application() {

    companion object {
        var mApplication: CommonApplication? = null
        fun getInstance() = mApplication

    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        //因为引用的包过多，实现多包问题
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        mApplication = this
        //CC初始化组件化
        CC.enableVerboseLog(CommonConstants.ISDUG)
        CC.enableDebug(CommonConstants.ISDUG)
        CC.init(this)
        CC.enableRemoteCC(CommonConstants.ISDUG)
        //初始化log
        LogUtils.getLogConfig()
            .configAllowLog(CommonConstants.ISDUG)
            .configTagPrefix("未来教育日志输出：")
            .configFormatTag("%d{HH:mm:ss:SSS} %t %c{-5}")
            .configShowBorders(false)
            .configLevel(LogLevel.TYPE_VERBOSE)

        //初始化头条适配方案
        AutoSize.initCompatMultiProcess(this)


        /**
         * 以下是 AndroidAutoSize 可以自定义的参数, {@link AutoSizeConfig} 的每个方法的注释都写的很详细
         * 使用前请一定记得跳进源码，查看方法的注释, 下面的注释只是简单描述!!!
         */
        AutoSizeConfig.getInstance()

            //是否让框架支持自定义 Fragment 的适配参数, 由于这个需求是比较少见的, 所以须要使用者手动开启
            //如果没有这个需求建议不开启
            .setCustomFragment(true).onAdaptListener = object : onAdaptListener {
            override fun onAdaptBefore(target: Any, activity: Activity) {
                //使用以下代码, 可以解决横竖屏切换时的屏幕适配问题
                //使用以下代码, 可支持 Android 的分屏或缩放模式, 但前提是在分屏或缩放模式下当用户改变您 App 的窗口大小时
                //系统会重绘当前的页面, 经测试在某些机型, 某些情况下系统不会重绘当前页面, ScreenUtils.getScreenSize(activity) 的参数一定要不要传 Application!!!
                //                        AutoSizeConfig.getInstance().setScreenWidth(ScreenUtils.getScreenSize(activity)[0]);
                //                        AutoSizeConfig.getInstance().setScreenHeight(ScreenUtils.getScreenSize(activity)[1]);
                LogUtils.d(
                    String.format(
                        Locale.ENGLISH,
                        "%s onAdaptBefore!",
                        target.javaClass.name
                    )
                )
            }

            override fun onAdaptAfter(target: Any, activity: Activity) {
                LogUtils.d(
                    String.format(
                        Locale.ENGLISH,
                        "%s onAdaptAfter!",
                        target.javaClass.name
                    )
                )
            }
        }
        customAdaptForExternal()
    }

    /**
     * 需要权限才能实例化
     * 这里有个问题第一次 BroadcastNetwork 里面网络不可用还有待修复
     */
    fun initialize() {
        CommonConfig.getInstance().initFileDir()
        //配置https的安全证书
        //val sslSocketFactory = ClientCertificateUtil.provideSSLSocketFactory()
        Kalle.setConfig(
            KalleConfig.newBuilder()
                .connectionTimeout(30, TimeUnit.SECONDS)
                .connectFactory(URLConnectionFactory.newBuilder().build())
                .cookieStore(DBCookieStore.newBuilder(this).build())
                // .sslSocketFactory(sslSocketFactory)
                .cacheStore(DiskCacheStore.newBuilder(CommonConfig.getInstance().PATH_APP_CACHE).build())
                .network(BroadcastNetwork(this))
                .addInterceptor(LoginInterceptor(this))
                .addInterceptor(LoggerInterceptor("复得网络请求：", CommonConstants.ISDUG))
                .converter(JsonConverter(this))
                .build()
        )

    }

    /**
     * 给外部的三方库 [Activity] 自定义适配参数, 因为三方库的 [Activity] 并不能通过实现
     * [CustomAdapt] 接口的方式来提供自定义适配参数 (因为远程依赖改不了源码)
     * 所以使用 [ExternalAdaptManager] 来替代实现接口的方式, 来提供自定义适配参数
     */
    private fun customAdaptForExternal() {
        /**
         * [ExternalAdaptManager] 是一个管理外部三方库的适配信息和状态的管理类, 详细介绍请看 [ExternalAdaptManager] 的类注释
         */
        AutoSizeConfig.getInstance().externalAdaptManager

            //加入的 Activity 将会放弃屏幕适配, 一般用于三方库的 Activity, 详情请看方法注释
            //如果不想放弃三方库页面的适配, 请用 addExternalAdaptInfoOfActivity 方法, 建议对三方库页面进行适配, 让自己的 App 更完美一点
            //                .addCancelAdaptOfActivity(DefaultErrorActivity.class)

            //为指定的 Activity 提供自定义适配参数, AndroidAutoSize 将会按照提供的适配参数进行适配, 详情请看方法注释
            //一般用于三方库的 Activity, 因为三方库的设计图尺寸可能和项目自身的设计图尺寸不一致, 所以要想完美适配三方库的页面
            //就需要提供三方库的设计图尺寸, 以及适配的方向 (以宽为基准还是高为基准?)
            //三方库页面的设计图尺寸可能无法获知, 所以如果想让三方库的适配效果达到最好, 只有靠不断的尝试
            //由于 AndroidAutoSize 可以让布局在所有设备上都等比例缩放, 所以只要您在一个设备上测试出了一个最完美的设计图尺寸
            //那这个三方库页面在其他设备上也会呈现出同样的适配效果, 等比例缩放, 所以也就完成了三方库页面的屏幕适配
            //即使在不改三方库源码的情况下也可以完美适配三方库的页面, 这就是 AndroidAutoSize 的优势
            //但前提是三方库页面的布局使用的是 dp 和 sp, 如果布局全部使用的 px, 那 AndroidAutoSize 也将无能为力
            //经过测试 DefaultErrorActivity 的设计图宽度在 380dp - 400dp 显示效果都是比较舒服的
            .addExternalAdaptInfoOfActivity(
                Activity::class.java,
                ExternalAdaptInfo(true, 400f)
            )
    }
}