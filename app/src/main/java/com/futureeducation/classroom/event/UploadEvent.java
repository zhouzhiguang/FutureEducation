package com.futureeducation.classroom.event;

/**
 * Created by UploadEvent.
 * User: ASUS
 * Date: 2019/11/13
 * Time: 15:35
 * 上传视频事件
 */
public class UploadEvent {
    private String videopath;
    public UploadEvent() {
    }

    @Override
    public String toString() {
        return "UploadEvent{" +
                "videopath='" + videopath + '\'' +
                '}';
    }

    public String getVideopath() {
        return videopath;
    }

    public void setVideopath(String videopath) {
        this.videopath = videopath;
    }
}
