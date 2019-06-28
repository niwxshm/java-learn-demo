package com.lizs.pattern.proxy.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class MeiPoCallbackFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {

        if ("findLove".equals(method.getName())) {
            return 0;
        }
        return 1;
    }
}
