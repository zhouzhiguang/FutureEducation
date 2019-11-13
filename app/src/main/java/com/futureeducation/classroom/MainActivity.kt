package com.futureeducation.classroom

import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import com.apkfuns.logutils.LogUtils
import com.futureeducation.classroom.activity.HomeActivity
import com.futureeducation.commonmodule.activities.CommonActivity

import com.futureeducation.commonmodule.application.CommonApplication
import com.futureeducation.commonmodule.constants.CommonConstants
import com.futureeducation.commonmodule.permission.AndPermissionUtill

import com.yanzhenjie.permission.AndPermission
import com.yanzhenjie.permission.runtime.Permission
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

class MainActivity : CommonActivity() {

    private var screeninfo = "手机屏幕宽是 ：%s 高是：%s"
    private var screeninfo2 = "手机屏幕屏幕密度DPI是 ：%s 屏幕密度density是：%s dp"
    private var andPermissionUtill: AndPermissionUtill? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        val mDisplay = windowManager.defaultDisplay
        val Width = mDisplay.width
        val Height = mDisplay.height
        screeninfo = String.format(screeninfo, Width.toString(), Height.toString())
        LogUtils.e("当前屏幕信息：$screeninfo")
        val metric = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(metric)
        val width = metric.widthPixels  // 屏幕宽度（像素）
        val height = metric.heightPixels  // 屏幕高度（像素）
        val density = metric.density  // 屏幕密度（0.75 / 1.0 / 1.5）
        val densityDpi = metric.densityDpi  // 屏幕密度DPI（120 / 160 / 240）
        val widDP = metric.widthPixels
        val heidp = metric.heightPixels
        screeninfo2 = String.format(screeninfo2, densityDpi.toString(), density.toString())
        LogUtils.e("dip是多少 $screeninfo2")
        initPermission()

    }


    //初始化权限
    private fun initPermission() {
        andPermissionUtill = AndPermissionUtill(this)
        andPermissionUtill!!.setPermissionStatListener(object :
            AndPermissionUtill.PermissionResultListener {
            override fun OnPermissionSuccess() {

                Observable.timer(1, TimeUnit.MILLISECONDS)
                    .compose(this@MainActivity.bindToLifecycle())
                    .observeOn(AndroidSchedulers.mainThread())
                    //.observeOn(Schedulers.IO());//因为上面是Thread.sleep,让主线程sleep了，所以下面要切换线程，真实环境则不需要这一行代码
                    .subscribe {
                        //一秒钟后默认跳转到功能界面
                        var appclication = CommonApplication.getInstance()
                        appclication!!.initialize()
                        var intent = Intent(this@MainActivity, HomeActivity::class.java)
                        jumpActivity(intent)
                        finish()

                    }
            }

            override fun OnPermissionSeting() {
                AndPermission.with(this@MainActivity).runtime().setting()
                    .start(CommonConstants.REQUEST_CODE_SETTING)

            }


        })
        andPermissionUtill!!.requestPermission(*Permission.Group.STORAGE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CommonConstants.REQUEST_CODE_SETTING) {
            andPermissionUtill!!.setPermissionStatListener(object :
                AndPermissionUtill.PermissionResultListener {
                override fun OnPermissionSuccess() {
                    Observable.timer(1, TimeUnit.MILLISECONDS)
                        .compose(this@MainActivity.bindToLifecycle())
                        .observeOn(AndroidSchedulers.mainThread())
                        //.observeOn(Schedulers.IO());//因为上面是Thread.sleep,让主线程sleep了，所以下面要切换线程，真实环境则不需要这一行代码
                        .subscribe {
                            //一秒钟后默认跳转到功能界面
                            var intent = Intent(this@MainActivity, HomeActivity::class.java)
                            jumpActivity(intent)
                            finish()

                        }
                }

                override fun OnPermissionSeting() {

                    AndPermission.with(this@MainActivity).runtime().setting()
                        .start(CommonConstants.REQUEST_CODE_SETTING)

                }

            })
            andPermissionUtill!!.requestPermission(*Permission.Group.STORAGE)
        }
    }

}
