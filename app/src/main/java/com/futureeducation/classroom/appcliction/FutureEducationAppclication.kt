package com.futureeducation.classroom.appcliction

import com.futureeducation.commonmodule.application.CommonApplication
import com.iflytek.cloud.SpeechConstant
import com.iflytek.cloud.SpeechUtility
import com.threshold.rxbus2.RxBus
import io.reactivex.android.schedulers.AndroidSchedulers

/**
 * Created by FutureEducationAppclication.
 * User: ASUS
 * Date: 2019/11/12
 * Time: 16:17
 *
 */
class FutureEducationAppclication : CommonApplication() {
    override fun onCreate() {
        super.onCreate()
         //初始化事件
        RxBus.setMainScheduler(AndroidSchedulers.mainThread())

        // 将“12345678”替换成您申请的APPID，申请地址：http://www.xfyun.cn
      // 请勿在“=”与appid之间添加任何空字符或者转义符
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=5dcdf6b6");
    }
}