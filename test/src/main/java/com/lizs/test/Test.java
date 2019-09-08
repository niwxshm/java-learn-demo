package com.lizs.test;

import java.lang.reflect.Proxy;

public class Test {
    public String string="";
    public static void main(String[] args) throws NoSuchFieldException {
        System.out.println(Test.class.getField("string").getType().getName());

        Proxy.newProxyInstance()
    }
}
