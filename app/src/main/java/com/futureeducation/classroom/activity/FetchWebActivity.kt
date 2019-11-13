package com.futureeducation.classroom.activity

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import com.apkfuns.logutils.LogUtils
import com.futureeducation.classroom.R
import com.futureeducation.classroom.llistener.AnalysisWebListener
import com.futureeducation.classroom.utill.AnalysisWebutill
import com.futureeducation.commonmodule.activities.CommonActivity
import com.futureeducation.commonmodule.http.callback.SimpleCallback
import com.futureeducation.commonmodule.http.converter.StringConverter
import com.gyf.immersionbar.ktx.immersionBar
import com.yanzhenjie.kalle.Kalle
import com.yanzhenjie.kalle.simple.SimpleResponse
import com.yanzhenjie.kalle.simple.cache.CacheMode
import kotlinx.android.synthetic.main.activity_fetch_web_layout.*

/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     抓取网页里面的内容
 * @Author:         作者名
 * @CreateDate:     2019/11/13 16:04
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/13 16:04
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class FetchWebActivity : CommonActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fetch_web_layout)
        immersionBar {
            fitsSystemWindows(true)
            statusBarColor(R.color.dialog_bottom_color)
            navigationBarColor(R.color.dialog_bottom_color)

        }
        initListener()
        initDate()
    }

    private fun initDate() {
        var url =
            "http://121.52.223.195:5080/yiyuneduapi/YiyuneduAppServlet?cmd=getServerVersion&isjson=true"
        Kalle.post(url).cacheMode(CacheMode.NETWORK_NO_THEN_READ_CACHE)
            .converter(StringConverter())
            .tag(this)
            .perform(object : SimpleCallback<String>(this) {
                override fun onResponse(response: SimpleResponse<String, String>?) {
                    if (response != null) {
                        var result = response.succeed()
                        if (!TextUtils.isEmpty(result)) {
                            LogUtils.e("我看看网页上的内容：" + response.succeed())
                            AnalysisWebutill(result, object : AnalysisWebListener {
                                override fun OnAnalysisSucess(dates: List<String>) {
                                    LogUtils.e("终于解析完成了：" + dates.toString())
                                    if (dates.size > 0) {
                                        wheelprogress.visibility = View.GONE
                                        webinfo.visibility = View.VISIBLE
                                        webinfo.text = dates.toString()
                                    } else {
                                        wheelprogress.visibility = View.GONE
                                        webinfo.visibility = View.VISIBLE
                                        webinfo.text = "不好意思解析网页内容失败了"
                                    }
                                }

                            })
                        }
                    }
                }
            })
    }

    private fun initListener() {

    }
}
