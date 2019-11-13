package com.futureeducation.commonmodule.http;

import com.apkfuns.logutils.LogUtils;
import com.futureeducation.commonmodule.application.CommonApplication;
import com.yanzhenjie.kalle.Request;
import com.yanzhenjie.kalle.Response;
import com.yanzhenjie.kalle.connect.Interceptor;
import com.yanzhenjie.kalle.connect.http.Chain;

import java.io.IOException;

/**
 * Created by ${zhou}.
 * User: Administrator
 * Date: 2019/4/30
 * Time: 9:40
 * 网请求登录过期账户状态拦截器
 */
public class LoginInterceptor implements Interceptor {
    private CommonApplication application;

    public LoginInterceptor(CommonApplication application) {
        this.application = application;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response originResponse = chain.proceed(request);
        LogUtils.e("测试头部信息code" + originResponse.code());
        if (originResponse.code() == 804) { // 授权已经过期
            //application 处理token已经过期了
            String msg = originResponse.body().toString();
            String url = request.url().toString();
            LogUtils.e("打印请求那个接口报的过期L:" + url);
           // application.LoginOverdue(msg);
            return originResponse;
        } else if (originResponse.code() == 805) {
            //数据被清楚
            //application.ServerDataFault();
            return originResponse;

        } else if (originResponse.code() == 403) {
            LogUtils.e("全局的已经封号--");
           // application.SealAccount();
            return originResponse;
        }
        return originResponse;
    }

}
