package com.futureeducation.classroom.activity

import android.os.Bundle
import android.view.View
import com.futureeducation.classroom.R
import com.futureeducation.commonmodule.activities.CommonActivity
import com.gyf.immersionbar.ktx.immersionBar
import com.hjq.bar.OnTitleBarListener
import kotlinx.android.synthetic.main.activity_budil_qrcode_layout.*


/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     生成二维码
 * @Author:         作者名
 * @CreateDate:     2019/11/13 20:28
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/13 20:28
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class BudilQrcodeActivity : CommonActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budil_qrcode_layout)
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
        titlebar.setOnTitleBarListener(object : OnTitleBarListener {
            override fun onLeftClick(v: View?) {
                finish()
            }

            override fun onRightClick(v: View?) {
            }

            override fun onTitleClick(v: View?) {
            }

        })

    }
}
