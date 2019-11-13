package com.futureeducation.commonmodule.modle;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by RequestResult.
 * User: ASUS
 * Date: 2019/11/12
 * Time: 15:03
 * 解析的modle类
 */
public class RequestResult {
    @JSONField(name = "code")
    private int code;
    @JSONField(name = "success")
    private boolean success;//这里是成功是请求返回的成功不是返回数据给我的成功标志
    @JSONField(name = "message")
    private String message;
    @JSONField(name = "data")
    private String data;

    public RequestResult() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestResult{" +
                "code=" + code +
                ", success=" + success +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
