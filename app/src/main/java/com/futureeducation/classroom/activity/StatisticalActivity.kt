package com.futureeducation.classroom.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.apkfuns.logutils.LogUtils
import com.futureeducation.classroom.R
import com.futureeducation.classroom.modle.StatisticalBean
import com.futureeducation.commonmodule.http.callback.SimpleCallback
import com.futureeducation.commonmodule.http.converter.RequestConverter
import com.gyf.immersionbar.ktx.immersionBar
import com.hjq.bar.OnTitleBarListener
import com.yanzhenjie.kalle.Kalle
import com.yanzhenjie.kalle.simple.SimpleResponse
import com.yanzhenjie.kalle.simple.cache.CacheMode
import kotlinx.android.synthetic.main.activity_statistical_layout.*

/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     统计图表数据
 * @Author:         作者名
 * @CreateDate:     2019/11/14 10:31
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/14 10:31
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class StatisticalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistical_layout)
        immersionBar {
            fitsSystemWindows(true)
            statusBarColor(R.color.dialog_bottom_color)
            navigationBarColor(R.color.dialog_bottom_color)

        }
        initListener()
        initDate()
    }

    private fun initDate() {
        //获取数据
        var url =
            "http://gz.ywdedu.com:5080/yiyuneduapi/YiyuneduAppServlet?cmd=getWeikeActionLoginByGla_group&isjson=true&gla_group=8069868a-cdc4-4a00-9be0-98627e54c167"
        Kalle.post(url).cacheMode(CacheMode.NETWORK_NO_THEN_READ_CACHE)
            .converter(RequestConverter(this))
            .tag(this)
            .perform(object : SimpleCallback<StatisticalBean>(this) {
                override fun onResponse(response: SimpleResponse<StatisticalBean, String>?) {
                    if (response != null) {
                        var result = response.succeed()
                        if (result != null) {
                            var no1 = result.`_$1`
                            LogUtils.e("我看看网页上的内容：" + no1)
                            wheelprogress.visibility = View.GONE

                        }
                    }
                }
            })
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
