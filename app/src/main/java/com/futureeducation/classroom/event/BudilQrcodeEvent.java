package com.futureeducation.classroom.event;

/**
 * Created by BudilQrcodeEvent.
 * User: ASUS
 * Date: 2019/11/14
 * Time: 10:04
 * 生成二维码事件
 */
public class BudilQrcodeEvent {
    private String path;

    public BudilQrcodeEvent() {
    }

    public BudilQrcodeEvent(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
