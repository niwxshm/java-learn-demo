package com.lizs.pattern.proxy.staticed;

import com.lizs.pattern.proxy.Person;

public class Father implements Person {
    private Person sun;

    public Father(Person sun) {
        this.sun = sun;
    }

    @Override
    public void  findLove(){
        System.out.println("根据儿子的要求找对象");
        this.sun.findLove();
        System.out.println("双方父母是否同意");
    }
}
