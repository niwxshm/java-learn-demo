package com.lizs.pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MeiPoMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是媒婆，我开始物色");
        methodProxy.invokeSuper(o,objects);
        System.out.println("如果合适的话，那就准备办事");
        return null;
    }
}
