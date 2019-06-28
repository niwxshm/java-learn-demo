package com.lizs.pattern.proxy.jdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class JdkWuBaTest {

    @Test
    public void getInstance() throws Exception {
        Someone someone = new XiaoMing();
        JdkWuBa jdkWuBa = new JdkWuBa();
        Someone proxy =(Someone) jdkWuBa.getInstance(someone);
        proxy.findJob();
        proxy.findLove();
    }
}