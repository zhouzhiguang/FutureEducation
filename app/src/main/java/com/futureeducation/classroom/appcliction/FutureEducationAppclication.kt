package com.futureeducation.classroom.appcliction

import com.futureeducation.commonmodule.application.CommonApplication
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
    }
}