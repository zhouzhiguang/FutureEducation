package com.futureeducation.classroom.activity

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.text.TextUtils
import android.util.TypedValue
import android.view.View
import cn.bingoogolapple.qrcode.zxing.QRCodeEncoder
import com.apkfuns.logutils.LogUtils
import com.futureeducation.classroom.R
import com.futureeducation.classroom.event.BudilQrcodeEvent
import com.futureeducation.classroom.utill.CommonUtil
import com.futureeducation.commonmodule.activities.CommonActivity
import com.gyf.immersionbar.ktx.immersionBar
import com.hjq.bar.OnTitleBarListener
import com.threshold.rxbus2.RxBus
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_budil_qrcode_layout.*


/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     生成二维码
 * @Author:         作者名
 * @CreateDate:     2019/11/13 20:28
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/13 20:28
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class BudilQrcodeActivity : CommonActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budil_qrcode_layout)
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
        budil.setOnClickListener {
            //开始生成二维码
            var info = qrcode_content.editableText.toString()
            //这是个耗时间操作异步
            if (!TextUtils.isEmpty(info)) {
                var bitmap = QRCodeEncoder.syncEncodeQRCode(
                    info,
                    100
                )
                Observable.just(bitmap)
                    .subscribeOn(Schedulers.io())
                    .compose(this.bindToLifecycle<Bitmap>())
                    // Be notified on the main thread 回调在主线程里面
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Observer<Bitmap> {
                        override fun onComplete() {

                        }

                        override fun onSubscribe(d: Disposable) {
                        }

                        override fun onNext(t: Bitmap) {
                            if (t != null) {
                                var commonUtil = CommonUtil(application)
                                var imagepath = commonUtil.saveBitmap(t)
                                LogUtils.e("当前保存的地址 $imagepath")
                                RxBus.getDefault().post(BudilQrcodeEvent(imagepath))
                                finish()
                            }

                        }

                        override fun onError(e: Throwable) {
                        }

                    })
            }

        }
    }

    fun dp2px(context: Context, dpValue: Float): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dpValue,
            context.resources.displayMetrics
        ).toInt()
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getDefault().unregister(this)
    }
}
