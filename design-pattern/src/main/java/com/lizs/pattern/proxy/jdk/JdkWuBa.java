package com.lizs.pattern.proxy.jdk;

import java.lang.reflect.Proxy;

public class JdkWuBa {
    private Someone target;

    public Object getInstance(Someone target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (proxy, method, args) -> {
            if ("findJob".equals(method.getName())) {
                System.out.println("我是58，我要帮你找工作，现在已经拿到你的需求");
            }
            method.invoke(this.target, args);
            if ("findJob".equals(method.getName())) {
                System.out.println("如果合适的话，就来上班啊");
            }
            return null;
        });
    }
}
