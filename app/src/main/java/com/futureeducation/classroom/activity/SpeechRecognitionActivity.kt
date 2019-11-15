package com.futureeducation.classroom.activity

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.apkfuns.logutils.LogUtils
import com.gyf.immersionbar.ktx.immersionBar
import com.hjq.bar.OnTitleBarListener
import com.iflytek.cloud.*
import com.iflytek.cloud.ui.RecognizerDialog
import com.iflytek.cloud.ui.RecognizerDialogListener
import kotlinx.android.synthetic.main.activity_speech_recognition_layout.*


/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     语音识别主要实现类
 * @Author:         作者名
 * @CreateDate:     2019/11/15 9:18
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/15 9:18
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class SpeechRecognitionActivity : AppCompatActivity(), InitListener, RecognizerDialogListener {


    private var mIatDialog: RecognizerDialog? = null
    private var sb: StringBuffer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.futureeducation.classroom.R.layout.activity_speech_recognition_layout)
        immersionBar {
            fitsSystemWindows(true)
            statusBarColor(com.futureeducation.classroom.R.color.dialog_bottom_color)
            navigationBarColor(com.futureeducation.classroom.R.color.dialog_bottom_color)

        }
        initListener()
        initDate()
    }

    private fun initDate() {
        //开始录音
        mIatDialog = RecognizerDialog(this, this)

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
        start_record.setOnClickListener {
            sb = StringBuffer()

            //            //设置语法ID和 SUBJECT 为空，以免因之前有语法调用而设置了此参数；或直接清空所有参数，具体可参考 DEMO 的示例。
            mIatDialog!!.setParameter(SpeechConstant.CLOUD_GRAMMAR, null);
            mIatDialog!!.setParameter(SpeechConstant.SUBJECT, null);
//
////设置返回结果格式，目前支持json,xml以及plain 三种格式，其中plain为纯听写文本内容
            mIatDialog!!.setParameter(SpeechConstant.RESULT_TYPE, "plain");
////此处engineType为“cloud”
            mIatDialog!!.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD);
////设置语音输入语言，zh_cn为简体中文
            mIatDialog!!.setParameter(SpeechConstant.LANGUAGE, "zh_cn");
////设置结果返回语言
//            mIatDialog!!.setParameter(SpeechConstant.ACCENT, "mandarin");
//// 设置语音前端点:静音超时时间，单位ms，即用户多长时间不说话则当做超时处理
////取值范围{1000～10000}
//            mIatDialog!!.setParameter(SpeechConstant.VAD_BOS, "4000");
////设置语音后端点:后端点静音检测时间，单位ms，即用户停止说话多长时间内即认为不再输入，
////自动停止录音，范围{0~10000}
//            mIatDialog!!.setParameter(SpeechConstant.VAD_EOS, "1000");
////设置标点符号,设置为"0"返回结果无标点,设置为"1"返回结果有标点
            mIatDialog!!.setParameter(SpeechConstant.ASR_PTT, "0");
            //以下为dialog设置听写参数
            //开始识别并设置监听器
            mIatDialog!!.setListener(this);
            mIatDialog!!.show();

        }
    }

    override fun onResult(recognizerResult: RecognizerResult?, p1: Boolean) {
        var resultS = recognizerResult!!.resultString
        LogUtils.e("识别结果：" + resultS)
        if (!TextUtils.isEmpty(resultS)) {
            sb!!.append(resultS)

        }
        result_speak.text = sb.toString()
    }

    override fun onError(error: SpeechError?) {
        LogUtils.e("识别出错了：" + error!!.message)
    }

    override fun onInit(code: Int) {
        LogUtils.e("onInit" + code)

        if (code != ErrorCode.SUCCESS) {
            LogUtils.e("初始化失败，错误码：$code,请点击网址https://www.xfyun.cn/document/error-code查询解决方案")
        }

    }
}
