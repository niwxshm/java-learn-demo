package com.lizs.pattern.proxy.jdk;

import com.lizs.pattern.proxy.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class JdkMeiPoTest {

    @Test
    public void getInstance() throws Exception {
        Someone someone = new XiaoMing();
        JdkWuBa  wuba = new JdkWuBa();
        Someone someoneProxy = (Someone)wuba.getInstance(someone);
        someoneProxy.findJob();
    }
}