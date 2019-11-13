package com.futureeducation.classroom.activity

import android.os.Bundle
import com.alibaba.sdk.android.oss.ClientConfiguration
import com.alibaba.sdk.android.oss.OSSClient
import com.alibaba.sdk.android.oss.common.OSSLog
import com.alibaba.sdk.android.oss.common.auth.OSSPlainTextAKSKCredentialProvider
import com.apkfuns.logutils.LogUtils
import com.futureeducation.classroom.R
import com.futureeducation.classroom.View.UIDisplayer
import com.futureeducation.classroom.constant.Config
import com.futureeducation.classroom.event.UploadEvent
import com.futureeducation.classroom.help.VideoMessageHelper
import com.futureeducation.classroom.service.OssService
import com.futureeducation.classroom.utill.ExternalStorage
import com.futureeducation.commonmodule.activities.CommonActivity
import com.futureeducation.commonmodule.config.CommonConfig

import com.gyf.immersionbar.ktx.immersionBar
import com.threshold.rxbus2.RxBus
import com.threshold.rxbus2.annotation.RxSubscribe

import kotlinx.android.synthetic.main.activity_uplad_vieo_layout.*

/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:    录像上传的界面 java类作用描述
 * @Author:         作者名
 * @CreateDate:     2019/11/13 13:04
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/13 13:04
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class VieoActivity : CommonActivity() {


    //负责所有的界面更新
    private var mUIDisplayer: UIDisplayer? = null
    private var mService: OssService? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uplad_vieo_layout)

        immersionBar {
            fitsSystemWindows(true)
            statusBarColor(R.color.dialog_bottom_color)
            navigationBarColor(R.color.dialog_bottom_color)

        }
        initListener()
        initDate()
        RxBus.getDefault().register(this)
    }

    private fun initDate() {

        initoos()

    }

    //初始化oss
    private fun initoos() {
        mUIDisplayer = UIDisplayer(imageView, bar, output_info, this)
        var endpoint = Config.OSS_ENDPOINT
        mService = initOSS(endpoint, mUIDisplayer!!)
        //设置上传的callback地址，目前暂时只支持putObject的回调
        mService!!.setCallbackAddress(Config.OSS_CALLBACK_URL)


    }

    private fun initListener() {
        make_video.setOnClickListener {
            ExternalStorage.getInstance().init(this, CommonConfig.getInstance().PATH_APP_ROOT)
            //录制视频界面
            var helper = VideoMessageHelper(this)
            helper.chooseVideoFromCamera()
        }

    }

    @RxSubscribe(isSticky = false)
    fun onEvent(event: UploadEvent) {
        var path = event.videopath
        LogUtils.e("要上传视频的路径：" + path)
        if (mService != null && path != null) {
            mService!!.asyncPutImage("test", path)
        } else {
            LogUtils.e("其中有空值了")
        }
    }



    fun initOSS(endpoint: String, displayer: UIDisplayer): OssService {

        //        移动端是不安全环境，不建议直接使用阿里云主账号ak，sk的方式。建议使用STS方式。具体参
        //        https://help.aliyun.com/document_detail/31920.html
        //        注意：SDK 提供的 PlainTextAKSKCredentialProvider 只建议在测试环境或者用户可以保证阿里云主账号AK，SK安全的前提下使用。具体使用如下
        //        主账户使用方式
        //        String AK = "******";
        //        String SK = "******";
        var credentialProvider = OSSPlainTextAKSKCredentialProvider(
            Config.OSS_ACCESS_KEY_ID,
            Config.OSS_ACCESS_KEY_SECRET
        )
        //        以下是使用STS Sever方式。
        //        如果用STS鉴权模式，推荐使用OSSAuthCredentialProvider方式直接访问鉴权应用服务器，token过期后可以自动更新。
        //        详见：https://help.aliyun.com/document_detail/31920.html
        //        OSSClient的生命周期和应用程序的生命周期保持一致即可。在应用程序启动时创建一个ossClient，在应用程序结束时销毁即可。


//        val credentialProvider: OSSCredentialProvider
//        //使用自己的获取STSToken的类
//        val stsServer = null;//
//        if (TextUtils.isEmpty(stsServer)) {
//            credentialProvider = OSSAuthCredentialsProvider(Config.STS_SERVER_URL)
//
//        } else {
//            credentialProvider = OSSAuthCredentialsProvider(stsServer)
//        }

        var editBucketName = Config.BUCKET_NAME;
        val conf = ClientConfiguration()
        conf.connectionTimeout = 15 * 1000 // 连接超时，默认15秒
        conf.socketTimeout = 15 * 1000 // socket超时，默认15秒
        conf.maxConcurrentRequest = 5 // 最大并发请求书，默认5个
        conf.maxErrorRetry = 2 // 失败后最大重试次数，默认2次
        val oss = OSSClient(applicationContext, endpoint, credentialProvider, conf)
        OSSLog.enableLog()
        return OssService(oss, editBucketName, displayer)

    }
    override fun onDestroy() {
        super.onDestroy()
        RxBus.getDefault().unregister(this)
    }
}
