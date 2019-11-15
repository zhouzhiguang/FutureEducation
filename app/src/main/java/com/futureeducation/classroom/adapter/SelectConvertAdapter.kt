package com.futureeducation.classroom.adapter

import android.text.TextUtils
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.futureeducation.classroom.R
import com.futureeducation.commonmodule.activities.CommonActivity


/**
 * Created by SelectConvertAdapter.
 * User: ASUS
 * Date: 2019/11/15
 * Time: 14:35
 */
class SelectConvertAdapter : BaseQuickAdapter<String, BaseViewHolder> {


    private var commonActivity: CommonActivity? = null

    constructor(activity: CommonActivity, layoutResId: Int, data: List<String>?) : super(
        layoutResId,
        data
    ) {
        commonActivity = activity

    }

    constructor(layoutResId: Int, data: List<String>?) : super(layoutResId, data) {

    }

    constructor(data: List<String>?) : super(data) {}

    constructor(layoutResId: Int) : super(layoutResId) {}

    override fun convert(helper: BaseViewHolder?, item: String?) {
        var image = helper!!.getView<ImageView>(R.id.image)
        var url = item
        if (!TextUtils.isEmpty(item)) {
            Glide.with(commonActivity!!).load(item).into(image)
        }

    }
}