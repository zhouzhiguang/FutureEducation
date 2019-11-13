package com.futureeducation.classroom.dialog

import android.os.Bundle
import android.text.TextUtils
import android.view.*
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.futureeducation.classroom.R
import com.futureeducation.classroom.llistener.OnCommonDialogListener
import com.futureeducation.commonmodule.view.CommonShapeButton

/**
 * Created by SelectVideoUploadDialog.
 * User: ASUS
 * Date: 2019/11/13
 * Time: 15:11
 * 视频是否上传对话框
 */
class SelectVideoUploadDialog : DialogFragment(), View.OnClickListener {
    private var msg: String? = null
    private val confirmstring: String? = null
    private var msgid: Int = 0
    private var listener: OnCommonDialogListener? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.select_setmeal_dialog)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val dialogWindow = getDialog()?.getWindow()
        val lp = dialogWindow!!.getAttributes()
        lp.width = ViewGroup.LayoutParams.WRAP_CONTENT
        lp.gravity = Gravity.CENTER
        dialogWindow!!.setAttributes(lp)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dialog = getDialog()
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val dialogWindow = dialog.getWindow()
        dialogWindow!!.getDecorView().setPadding(0, 0, 0, 0)// 这个很重
        dialogWindow!!.setGravity(Gravity.BOTTOM)
        //dialogWindow.setWindowAnimations(R.style.tipsAnimation);
        dialog.setCancelable(true)
        dialog.setCanceledOnTouchOutside(true)
        var view = inflater.inflate(R.layout.select_video_pload_dialog_layout, null)
        var reTextview = view.findViewById<CommonShapeButton>(R.id.recording)
        val massage = view.findViewById<TextView>(R.id.msg)
        if (!TextUtils.isEmpty(msg)) {
            massage.text = msg
        }
        if (msgid != 0) {
            massage.setText(msgid)
        }
        val confirm = view.findViewById<View>(R.id.confirm)
        confirm.setOnClickListener(this)
        val cancel = view.findViewById<View>(R.id.cancel)
        cancel.setOnClickListener(this)

        return view
    }


    fun setMassageText(text: String) {
        if (!TextUtils.isEmpty(text)) {
            this.msg = text
        }
    }


    fun setMassageText(ids: Int) {

        this.msgid = ids

    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.confirm -> {
                    if (listener != null) {
                        listener!!.OnCommonDialogConfirm()

                    }
                    dismiss()
                }
                R.id.cancel -> {
                    if (listener != null) {
                        listener!!.OnCommonDialogCancel()
                    }
                    dismiss()
                }
            }
        }

    }

    fun setOnCommonDialogListener(listener: OnCommonDialogListener) {

        this.listener = listener
    }
}