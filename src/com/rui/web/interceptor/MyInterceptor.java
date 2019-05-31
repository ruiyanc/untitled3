package com.rui.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截前。。。");
//        放行
        String invoke = actionInvocation.invoke();
        System.out.println("拦截后。。。");
        return invoke;
    }
}
