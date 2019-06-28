package com.lizs.pattern.observer;

import java.lang.reflect.Method;

public class Callback {
    private Object target;
    private Method method;

    public Callback(Object target, Method callback) {
        this.target = target;
        this.method = callback;
    }

    public Object getTarget() {
        return target;
    }

    public Method getMethod() {
        return method;
    }
}
