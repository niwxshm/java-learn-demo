package com.lizs.pattern.proxy.cglib;

import com.lizs.pattern.proxy.Person;

public class ZhangSan implements Person {
    @Override
    public void findLove() {
        System.out.println("我是张三，我想找对象");
    }
}
