package com.futureeducation.classroom.dialog

import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment
import com.futureeducation.classroom.R
import com.futureeducation.classroom.llistener.SelectUploadListener
import com.futureeducation.commonmodule.view.CommonShapeButton

/**
 * Created by SelectUploadDialog.
 * User: ASUS
 * Date: 2019/11/12
 * Time: 19:56
 * 选择上传文件类型
 */
class SelectUploadDialog : DialogFragment(), View.OnClickListener {

    private var listener: SelectUploadListener? = null
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
        var view = inflater.inflate(R.layout.select_upload_dialog_layout, null)
        var reTextview = view.findViewById<CommonShapeButton>(R.id.recording)
        reTextview.setOnClickListener(this)
        view.findViewById<CommonShapeButton>(R.id.video).setOnClickListener(this)

        return view
    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.recording -> {
                    if (listener != null) {
                        listener!!.OnSelectRecording()

                    }
                    dismiss()
                }
                R.id.video -> {
                    if (listener != null) {
                        listener!!.OnSelectVieo()
                    }
                    dismiss()
                }
            }
        }

    }

    public fun setOnSelectUploadListener(listener: SelectUploadListener) {
        this.listener = listener

    }
}
