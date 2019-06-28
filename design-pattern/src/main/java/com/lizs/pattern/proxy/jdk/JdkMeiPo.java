package com.lizs.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkMeiPo {
    private Someone target;

    public Object getInstance(Someone target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (proxy, method, args) -> {
            System.out.println("我是媒婆，我要给你找对象，现在已经拿到你的需求");
            method.invoke(this.target,args);
            System.out.println("如果合适的话，就准备结婚了");
            return null;
        });
    }
}
