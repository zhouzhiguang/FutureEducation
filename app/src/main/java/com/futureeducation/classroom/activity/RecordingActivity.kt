package com.futureeducation.classroom.activity

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.os.SystemClock
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.alibaba.sdk.android.oss.ClientConfiguration
import com.alibaba.sdk.android.oss.OSSClient
import com.alibaba.sdk.android.oss.common.OSSLog
import com.alibaba.sdk.android.oss.common.auth.OSSPlainTextAKSKCredentialProvider
import com.apkfuns.logutils.LogUtils
import com.futureeducation.classroom.R
import com.futureeducation.classroom.View.UIDisplayer
import com.futureeducation.classroom.constant.Config
import com.futureeducation.classroom.service.OssService
import com.futureeducation.classroom.utill.MediaUtils
import com.futureeducation.commonmodule.activities.CommonActivity
import com.futureeducation.commonmodule.config.CommonConfig

import com.gyf.immersionbar.ktx.immersionBar
import kotlinx.android.synthetic.main.activity_recording_layout.*
import java.io.File
import java.util.*

/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     用来录音的主界面
 * @Author:         作者名
 * @CreateDate:     2019/11/13 8:49
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/13 8:49
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class RecordingActivity : CommonActivity() {

    private var mediaUtils: MediaUtils? = null
    private var isCancel: Boolean = false
    private var duration: String? = null//录音时长
    private var path: String? = null

    //负责所有的界面更新
    private var mUIDisplayer: UIDisplayer? = null
    private var mService: OssService? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recording_layout)
        immersionBar {
            fitsSystemWindows(true)
            statusBarColor(R.color.dialog_bottom_color)
            navigationBarColor(R.color.dialog_bottom_color)

        }
        initListener()
        initDate()
    }

    //初始化录制音频参数
    private fun initDate() {
        mediaUtils = MediaUtils(this)
        mediaUtils!!.setRecorderType(MediaUtils.MEDIA_AUDIO)
        mediaUtils!!.setTargetDir(File(CommonConfig.getInstance().PATH_APP_CACHE))
        mediaUtils!!.setTargetName(UUID.randomUUID().toString() + ".m4a")

    }

    private fun initListener() {
        start.setOnTouchListener(object : View.OnTouchListener {
            @SuppressLint("NewApi")
            @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {

                var ret = false
                val downY = 0f
                val action = event!!.getAction()
                when (v!!.getId()) {
                    R.id.start ->

                        when (action) {

                            MotionEvent.ACTION_DOWN -> {
                                startAnim(true)
                                mediaUtils!!.record()
                                ret = true
                            }
                            MotionEvent.ACTION_UP -> {
                                stopAnim()
                                if (isCancel) {
                                    isCancel = false
                                    mediaUtils?.stopRecordUnSave()
                                    Toast.makeText(
                                        this@RecordingActivity,
                                        "取消保存",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else {
                                    val duration = getDuration(time_display.getText().toString())
                                    when (duration) {
                                        -1 -> {
                                        }
                                        -2 -> {
                                            mediaUtils!!.stopRecordUnSave()
                                            upload.visibility = View.GONE
                                            Toast.makeText(
                                                this@RecordingActivity,
                                                "时间太短",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                        else -> {
                                            mediaUtils!!.stopRecordSave()
                                            val path = mediaUtils!!.getTargetFilePath()
                                            LogUtils.e("当前保存录音的地址是：" + path)
                                            this@RecordingActivity.path = path
                                            var file = File(path)
                                            if (file.exists()) {
                                                upload.visibility = View.VISIBLE
                                                LogUtils.e("文件大小：" + file.length())
                                            } else {
                                                LogUtils.e("文件为生成功")
                                            }
                                            Toast.makeText(
                                                this@RecordingActivity,
                                                "文件以保存至：$path",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                    }
                                }
                            }
                            MotionEvent.ACTION_MOVE -> {
                                val currentY = event.getY()
                                if (downY - currentY > 10) {
                                    moveAnim()
                                    isCancel = true
                                } else {
                                    isCancel = false
                                    startAnim(false)
                                }
                            }
                        }
                }
                return ret

            }

        })
        upload.setOnClickListener {
            //上传录音文件来
            if (mService != null && path != null) {
                mService!!.asyncPutImage("test", path)
            } else {
                LogUtils.e("其中有空值了")
            }
        }
    }

    private fun getDuration(str: String): Int {
        val a = str.substring(0, 1)
        val b = str.substring(1, 2)
        val c = str.substring(3, 4)
        val d = str.substring(4)
        if (a == "0" && b == "0") {
            if (c == "0" && Integer.valueOf(d) < 1) {
                return -2
            } else if (c == "0" && Integer.valueOf(d) > 1) {
                duration = d
                return Integer.valueOf(d)
            } else {
                duration = c + d
                return Integer.valueOf(c + d)
            }
        } else {
            duration = "60"
            return -1
        }

    }

    //停止录音
    private fun stopAnim() {
        audio_layout.setVisibility(View.GONE)
        //mic.setBackground(resources.getDrawable(R.drawable.mic_bg))
        time_display.stop()
    }

    @SuppressLint("NewApi")
    private fun moveAnim() {
        tv_info.setText("松手取消")
        mic_icon.setBackground(null)
        mic_icon.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_undo_black_24dp))
    }

    //开始录制音频

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    private fun startAnim(isStart: Boolean) {
        audio_layout.setVisibility(View.VISIBLE)
        tv_info.setText("上滑取消")
        //start.setBackground(resources.getDrawable(R.drawable.mic_pressed_bg))
        mic_icon.background = null
        mic_icon.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_mic_white_24dp))
        if (isStart) {
            time_display.setBase(SystemClock.elapsedRealtime())
            time_display.setFormat("%S")
            time_display.start()
        }

    }

    override fun onResume() {
        super.onResume()
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
}
