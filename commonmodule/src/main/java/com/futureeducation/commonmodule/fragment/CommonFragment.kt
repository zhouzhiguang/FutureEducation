package com.futureeducation.commonmodule.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trello.rxlifecycle3.components.support.RxFragment

/**
 * Created by CommonFragment.
 * User: ASUS
 * Date: 2019/11/12
 * Time: 15:09
 * 公共的fragment 类
 */
class CommonFragment : RxFragment() {
    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}