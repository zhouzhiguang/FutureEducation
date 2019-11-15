package com.futureeducation.classroom.activity

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import com.apkfuns.logutils.LogUtils
import com.bumptech.glide.Glide
import com.futureeducation.classroom.R
import com.futureeducation.classroom.event.BudilQrcodeEvent
import com.futureeducation.classroom.event.ScanResultEvent
import com.futureeducation.commonmodule.activities.CommonActivity
import com.futureeducation.commonmodule.constants.CommonConstants
import com.futureeducation.commonmodule.permission.AndPermissionUtill
import com.gyf.immersionbar.ktx.immersionBar
import com.hjq.bar.OnTitleBarListener
import com.threshold.rxbus2.RxBus
import com.threshold.rxbus2.annotation.RxSubscribe
import com.yanzhenjie.permission.AndPermission
import com.yanzhenjie.permission.runtime.Permission
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_qrcode_layout.*

/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     二维码操作
 * @Author:         作者名
 * @CreateDate:     2019/11/13 17:55
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/13 17:55
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class QRcodeActivity : CommonActivity() {

    private var andPermissionUtill: AndPermissionUtill? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode_layout)


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


    }

    private fun initListener() {
        titlebar.setOnTitleBarListener(object : OnTitleBarListener {
            override fun onLeftClick(v: View?) {
                finish()
            }

            override fun onRightClick(v: View?) {
            }

            override fun onTitleClick(v: View?) {
            }

        })
        scan.setOnClickListener {
            //检查相机权限
            andPermissionUtill = AndPermissionUtill(this)
            andPermissionUtill!!.setPermissionStatListener(object :
                AndPermissionUtill.PermissionResultListener {
                override fun OnPermissionSuccess() {
                    //扫描二维码
                    jumpActivity(
                        Intent(
                            this@QRcodeActivity
                            , ScanActivity::class.java
                        )
                    )

                }

                override fun OnPermissionSeting() {
                    AndPermission.with(this@QRcodeActivity).runtime().setting()
                        .start(CommonConstants.REQUEST_CODE_SETTING)

                }

            })
            andPermissionUtill!!.requestPermission(*Permission.Group.CAMERA)

        }

        budilqrcode.setOnClickListener {
            //生成二维码
            jumpActivity(Intent(this, BudilQrcodeActivity::class.java))
        }
    }

    @RxSubscribe(isSticky = false)
    fun onEvent(event: ScanResultEvent) {
        var resulttext = event.scanresult
        if (!TextUtils.isEmpty(resulttext)) {
            LogUtils.e("扫描结果返回：$resulttext")
            Observable.timer(1, java.util.concurrent.TimeUnit.MILLISECONDS)
                .compose(this.bindToLifecycle())
                .observeOn(AndroidSchedulers.mainThread())
                //.observeOn(Schedulers.IO());//因为上面是Thread.sleep,让主线程sleep了，所以下面要切换线程，真实环境则不需要这一行代码
                .subscribe {
                    scanresult.visibility = View.VISIBLE
                    qrcode_iamge.visibility = View.GONE
                    scanresult.text = resulttext

                }
        }
    }

    @RxSubscribe(isSticky = false)
    fun onEvent(event: BudilQrcodeEvent) {
        Observable.timer(1, java.util.concurrent.TimeUnit.MILLISECONDS)
            .compose(this.bindToLifecycle())
            .observeOn(AndroidSchedulers.mainThread())
            //.observeOn(Schedulers.IO());//因为上面是Thread.sleep,让主线程sleep了，所以下面要切换线程，真实环境则不需要这一行代码
            .subscribe {
                scanresult.visibility = View.GONE
                qrcode_iamge.visibility = View.VISIBLE
                var iamgepath = event.path
                LogUtils.e("保存的二维码$iamgepath")
                if (!TextUtils.isEmpty(iamgepath)) {
                    Glide.with(this).load(iamgepath).into(qrcode_iamge)
                }
            }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CommonConstants.REQUEST_CODE_SETTING) {
            andPermissionUtill!!.setPermissionStatListener(object :
                AndPermissionUtill.PermissionResultListener {
                override fun OnPermissionSuccess() {
                    jumpActivity(
                        Intent(
                            this@QRcodeActivity
                            , ScanActivity::class.java
                        )
                    )
                }

                override fun OnPermissionSeting() {

                    AndPermission.with(this@QRcodeActivity).runtime().setting()
                        .start(CommonConstants.REQUEST_CODE_SETTING)

                }

            })
            andPermissionUtill!!.requestPermission(*Permission.Group.CAMERA)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getDefault().unregister(this)
    }
}
