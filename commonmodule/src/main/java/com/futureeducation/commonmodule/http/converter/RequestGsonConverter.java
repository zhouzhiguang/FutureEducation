package com.futureeducation.commonmodule.http.converter;

import android.content.Context;

import com.alibaba.fastjson.JSON;
import com.apkfuns.logutils.LogUtils;
import com.yanzhenjie.kalle.Response;
import com.yanzhenjie.kalle.simple.Converter;
import com.yanzhenjie.kalle.simple.SimpleResponse;

import java.lang.reflect.Type;

public class RequestGsonConverter implements Converter {
    private Context mContext;
    //private Gson gson;

    public RequestGsonConverter(Context constant) {
        this.mContext = constant;
        //gson = new Gson();

    }

    @Override
    public <S, F> SimpleResponse<S, F> convert(Type succeed, Type failed, Response response,
                                               boolean fromCache) throws Exception {
        S succeedData = null; // The data when the business successful.
        F failedData = null; // The data when the business failed.
        int code = response.code();
        String serverJson = response.body().string();
        LogUtils.e("请求结果：" + serverJson);
        try {
            succeedData = JSON.parseObject(serverJson, succeed);
        } catch (Exception e) {
            LogUtils.e("parseObject: " + e);
        }
        return SimpleResponse.<S, F>newBuilder()
                .code(response.code())
                .headers(response.headers())
                .fromCache(fromCache)
                .succeed(succeedData)
                .build();
    }
}
