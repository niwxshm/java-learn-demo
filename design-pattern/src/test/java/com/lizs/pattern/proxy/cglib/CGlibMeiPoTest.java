package com.lizs.pattern.proxy.cglib;

import org.junit.Test;

import static org.junit.Assert.*;

public class CGlibMeiPoTest {

    @Test
    public void cglibTest(){
        try {
            Object instance = new CGlibMeiPo().getInstance(ZhangSan.class);
            ZhangSan zhangSan = (ZhangSan)instance;
            zhangSan.hashCode();
            zhangSan.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}