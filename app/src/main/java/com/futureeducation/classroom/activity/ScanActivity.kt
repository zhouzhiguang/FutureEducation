package com.futureeducation.classroom.activity


import android.os.Bundle
import android.os.Vibrator
import cn.bingoogolapple.qrcode.core.BarcodeType
import cn.bingoogolapple.qrcode.core.QRCodeView
import com.apkfuns.logutils.LogUtils
import com.futureeducation.classroom.R
import com.futureeducation.classroom.event.ScanResultEvent
import com.futureeducation.commonmodule.activities.CommonActivity
import com.gyf.immersionbar.ktx.immersionBar
import com.threshold.rxbus2.RxBus
import kotlinx.android.synthetic.main.activity_scan_acticity_layout.*

/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     二维码扫描主界面
 * @Author:         作者名
 * @CreateDate:     2019/11/13 18:21
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/13 18:21
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class ScanActivity : CommonActivity(), QRCodeView.Delegate {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan_acticity_layout)

        immersionBar {
            fitsSystemWindows(true)
            statusBarColor(R.color.dialog_bottom_color)
            navigationBarColor(R.color.dialog_bottom_color)

        }
        initListener()
        initDate()
        RxBus.getDefault().register(this)
    }

    override fun onStart() {
        super.onStart()
        zxingview.startCamera(); // 打开后置摄像头开始预览，但是并未开始识别
//        mZXingView.startCamera(Camera.CameraInfo.CAMERA_FACING_FRONT); // 打开前置摄像头开始预览，但是并未开始识别

        zxingview.startSpotAndShowRect(); // 显示扫描框，并开始识别
        zxingview.getScanBoxView().setOnlyDecodeScanBoxArea(false); // 识别整个屏幕中的码

    }

    override fun onResume() {
        super.onResume()
    }

    private fun initDate() {
        zxingview.setDelegate(this)
        zxingview.changeToScanQRCodeStyle() // 切换成扫描二维码样式
        zxingview.setType(BarcodeType.ALL, null) // 识别所有类型的码
        zxingview.startSpotAndShowRect() // 显示扫描框，并开始识别

    }

    private fun initListener() {
        back.setOnClickListener {
            finish()
        }

    }

    override fun onScanQRCodeSuccess(result: String?) {
        vibrate();
        //zxingview.startSpot(); // 开始识别
        LogUtils.e("识别成功了：" + result)
        var event = ScanResultEvent()
        event.scanresult = result
        RxBus.getDefault().post(event)
        finish()


    }

    private fun vibrate() {
        val vibrator = getSystemService(VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(200)

    }

    override fun onCameraAmbientBrightnessChanged(isDark: Boolean) {
        LogUtils.e("当前周围环境黑暗$isDark")
    }

    override fun onScanQRCodeOpenCameraError() {
        LogUtils.e("打开相机出错了")
    }

    override fun onStop() {
        zxingview.stopCamera()
        super.onStop()
    }

    override fun onDestroy() {
        zxingview.onDestroy(); // 销毁二维码扫描控件
        super.onDestroy()
        RxBus.getDefault().unregister(this)
    }
}
