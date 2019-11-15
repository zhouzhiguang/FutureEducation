package com.futureeducation.classroom.activity

import android.content.Intent
import android.os.Bundle
import com.futureeducation.classroom.R
import com.futureeducation.classroom.dialog.SelectUploadDialog
import com.futureeducation.classroom.llistener.SelectUploadListener
import com.futureeducation.commonmodule.activities.CommonActivity
import com.gyf.immersionbar.ktx.immersionBar
import kotlinx.android.synthetic.main.activity_home_layout.*

class HomeActivity : CommonActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_layout)
        immersionBar {
            fitsSystemWindows(true)
            statusBarColor(R.color.dialog_bottom_color)
            navigationBarColor(R.color.dialog_bottom_color)

        }
        initListener()
        initDate()
    }

    private fun initDate() {

    }

    private fun initListener() {
        upload.setOnClickListener {
            //上传
            var dialog = SelectUploadDialog()
            dialog.show(supportFragmentManager, "dialog")
            dialog.setOnSelectUploadListener(object : SelectUploadListener {
                override fun OnSelectRecording() {
                    jumpActivity(Intent(this@HomeActivity, RecordingActivity::class.java))

                }

                override fun OnSelectVieo() {

                    jumpActivity(Intent(this@HomeActivity, VieoActivity::class.java))

                }

            })
        }
        fetchweb.setOnClickListener {
            //抓取网页上的内容
            jumpActivity(Intent(this, FetchWebActivity::class.java))

        }
        QRcode.setOnClickListener {
            //二维码扫描生成
            jumpActivity(Intent(this, QRcodeActivity::class.java))
        }
        //统计图表
        statistical.setOnClickListener {
            jumpActivity(Intent(this, StatisticalActivity::class.java))
        }
        speech_recognition.setOnClickListener {
            jumpActivity(Intent(this,SpeechRecognitionActivity::class.java))
        }
    }
}
