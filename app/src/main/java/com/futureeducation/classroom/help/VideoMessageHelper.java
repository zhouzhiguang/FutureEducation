package com.futureeducation.classroom.help;

import com.apkfuns.logutils.LogUtils;
import com.futureeducation.classroom.activity.CaptureVideoActivity;
import com.futureeducation.classroom.utill.C;
import com.futureeducation.classroom.utill.StorageType;
import com.futureeducation.classroom.utill.StorageUtil;
import com.futureeducation.classroom.utill.StringUtil;
import com.futureeducation.commonmodule.activities.CommonActivity;

import java.io.File;


/**
 * Created by VideoMessageHelper.
 * User: ASUS
 * Date: 2019/11/13
 * Time: 13:15
 * 视频录制帮助类
 */
public class VideoMessageHelper {

    private File videoFile;
    private String videoFilePath;

    private CommonActivity activity;

    private int localRequestCode;
    private int captureRequestCode;

    public VideoMessageHelper(CommonActivity activity) {
        this.activity = activity;

    }


    /************************************************* 视频操作S *******************************************/

    /**
     * 拍摄视频
     */
    public void chooseVideoFromCamera() {
        if (!StorageUtil.hasEnoughSpaceForWrite(activity, StorageType.TYPE_VIDEO, true)) {
            return;
        }
        videoFilePath = StorageUtil.getWritePath(activity, StringUtil.get36UUID() + C.FileSuffix.MP4,
                StorageType.TYPE_TEMP);
        videoFile = new File(videoFilePath);
        LogUtils.e("当前视频存放位置：" + videoFilePath);
        // 启动视频录制
        CaptureVideoActivity.start(activity, videoFilePath, captureRequestCode);
    }
}
