package com.lizs.pattern.proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class CGlibMeiPo{

    public Object getInstance(Class<?> clazz) throws Exception {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);

        Callback[] callbacks =  {new MeiPoMethodInterceptor(), NoOp.INSTANCE };
        enhancer.setCallbacks(callbacks);
        enhancer.setCallbackFilter(new MeiPoCallbackFilter());
        return enhancer.create();
    }


}