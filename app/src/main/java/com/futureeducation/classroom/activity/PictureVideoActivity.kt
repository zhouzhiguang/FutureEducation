package com.futureeducation.classroom.activity

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.apkfuns.logutils.LogUtils
import com.futureeducation.classroom.R
import com.futureeducation.classroom.adapter.SelectConvertAdapter
import com.futureeducation.classroom.convert.SequenceEncoderMp4
import com.futureeducation.classroom.engine.GifSizeFilter
import com.futureeducation.classroom.engine.Glide4Engine
import com.futureeducation.commonmodule.activities.CommonActivity
import com.futureeducation.commonmodule.config.CommonConfig
import com.futureeducation.commonmodule.constants.CommonConstants
import com.futureeducation.commonmodule.permission.AndPermissionUtill
import com.futureeducation.commonmodule.utill.ToastUtils
import com.gyf.immersionbar.ktx.immersionBar
import com.hjq.bar.OnTitleBarListener
import com.yanzhenjie.permission.AndPermission
import com.yanzhenjie.permission.runtime.Permission
import com.zhihu.matisse.Matisse
import com.zhihu.matisse.MimeType
import com.zhihu.matisse.filter.Filter
import com.zhihu.matisse.internal.entity.CaptureStrategy
import com.zhihu.matisse.listener.OnCheckedListener
import com.zhihu.matisse.listener.OnSelectedListener
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_picture_video_layout.*
import java.io.File
import java.io.IOException

/**
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Description:     多图转换成视频
 * @Author:         作者名
 * @CreateDate:     2019/11/15 13:08
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/11/15 13:08
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class PictureVideoActivity : CommonActivity() {
    private val andPermissionUtill by lazy { AndPermissionUtill(this) }
    private val imagedates by lazy { mutableListOf<String>() }
    private var adapter: SelectConvertAdapter? = null
    private val REQUEST_CODE_CHOOSE = 23
    private val SELECT_IMAGE_MAX_SIZE = 50;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_video_layout)
        immersionBar {
            fitsSystemWindows(true)
            statusBarColor(com.futureeducation.classroom.R.color.dialog_bottom_color)
            navigationBarColor(com.futureeducation.classroom.R.color.dialog_bottom_color)

        }
        initListener()
        initDate()
    }

    private fun initDate() {
        var manager = GridLayoutManager(this, 3)
        recyclerview.layoutManager = manager
        adapter = SelectConvertAdapter(this, R.layout.picture_video_item_layout, imagedates)
        recyclerview.adapter = adapter

    }

    private fun initListener() {
        titlebar.setOnTitleBarListener(object : OnTitleBarListener {
            override fun onLeftClick(v: View?) {
                finish()

            }

            override fun onRightClick(v: View?) {
                //跳转到选择图片界面判断是否有相机权限
                andPermissionUtill!!.setPermissionStatListener(object :
                    AndPermissionUtill.PermissionResultListener {
                    override fun OnPermissionSuccess() {
                        selectPicture()
                    }

                    override fun OnPermissionSeting() {
                        AndPermission.with(this@PictureVideoActivity).runtime().setting()
                            .start(CommonConstants.REQUEST_CODE_SETTING)

                    }


                })
                andPermissionUtill!!.requestPermission(*Permission.Group.CAMERA)


            }

            override fun onTitleClick(v: View?) {
            }

        })
        transform.setOnClickListener {
            //转换了
            if (imagedates.size > 0) {
                Observable.timer(1, java.util.concurrent.TimeUnit.MILLISECONDS)
                    .compose(this.bindToLifecycle())
                    .observeOn(AndroidSchedulers.mainThread())
                    //.observeOn(Schedulers.IO());//因为上面是Thread.sleep,让主线程sleep了，所以下面要切换线程，真实环境则不需要这一行代码
                    .subscribe {
                        performJcodec(imagedates)
                    }

            } else {
                ToastUtils.showCenterToast(this, "请先选择图片")
            }
        }
    }


    private fun selectPicture() {
        //头像
        Matisse.from(this)
            .choose(MimeType.ofImage(), false)
            .theme(R.style.Matisse_Dracula)
            .countable(true)
            .capture(true)
            .captureStrategy(
                CaptureStrategy(
                    true,
                    "com.futureeducation.classroom.fileprovider.SelectImageFileProvider",
                    "futereducation"
                )
            )
            .maxSelectable(SELECT_IMAGE_MAX_SIZE - imagedates.size)
            .addFilter(GifSizeFilter(320, 320, 5 * Filter.K * Filter.K))
            .gridExpectedSize(
                resources.getDimensionPixelSize(R.dimen.dp_120)
            )
            .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
            .thumbnailScale(0.65f)
            //                                            .imageEngine(new GlideEngine())  // for glide-V3
            .imageEngine(Glide4Engine())    // for glide-V4
            .setOnSelectedListener(OnSelectedListener { uriList, pathList ->
                // DO SOMETHING IMMEDIATELY HERE
                LogUtils.e("onSelected" + "onSelected: pathList=$pathList")
            })
            .originalEnable(false)
            .maxOriginalSize(10)
            .autoHideToolbarOnSingleTap(true)
            .setOnCheckedListener(OnCheckedListener { isChecked ->
                // DO SOMETHING IMMEDIATELY HERE
                LogUtils.e("isChecked", "onCheck: isChecked=$isChecked")
            })
            .forResult(REQUEST_CODE_CHOOSE)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_CHOOSE && resultCode == Activity.RESULT_OK) {
            val list = Matisse.obtainResult(data)
            var list1 = Matisse.obtainPathResult(data)
            if (list1 != null && list1.size > 0) {
                imagedates.addAll(list1)
                adapter!!.notifyDataSetChanged()

                LogUtils.e("查看这个选择的图片集合" + imagedates.toString())

            }
        } else if (requestCode == CommonConstants.REQUEST_CODE_SETTING) {
            andPermissionUtill!!.setPermissionStatListener(object :
                AndPermissionUtill.PermissionResultListener {
                override fun OnPermissionSuccess() {
                    selectPicture()
                }

                override fun OnPermissionSeting() {

                    AndPermission.with(this@PictureVideoActivity).runtime().setting()
                        .start(CommonConstants.REQUEST_CODE_SETTING)

                }

            })
            andPermissionUtill!!.requestPermission(*Permission.Group.CAMERA)
        }

    }

    private fun performJcodec(dates: List<String>) {
        try {
            Log.e("performJcodec: ", "执行开始")
            var se: SequenceEncoderMp4? = null
            val out = File(CommonConfig.getInstance().PATH_APP_CACHE, "jcodec_enc.mp4")
            se = SequenceEncoderMp4(out)
            for (i in dates) {
                val frame =
                    com.futureeducation.classroom.convert.BitmapUtil.decodeSampledBitmapFromFile(
                        i,
                        480,
                        320
                    )
                se!!.encodeImage(frame)
                LogUtils.e("performJcodec 执行到的图片是 $i")
            }
            se!!.finish()
            LogUtils.e("performdec: " + "执行完成")
            runOnUiThread {
                ToastUtils.showCenterToast(this, "生成成功")
            }
            var intent = Intent(Intent.ACTION_VIEW);
            var uri = Uri.fromFile(out);
            intent.setDataAndType(uri, "video/*");
            startActivity(intent);
        } catch (e: IOException) {
            e.printStackTrace()
            Log.e("performJcodec: ", "执行异常 $e")
        }

    }
}
