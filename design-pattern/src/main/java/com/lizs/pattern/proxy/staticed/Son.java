package com.lizs.pattern.proxy.staticed;

import com.lizs.pattern.proxy.Person;

public class Son implements Person {
    @Override
    public void findLove(){
        System.out.println("我想要一个年轻貌美，身材美妙的女子");
    }
}
