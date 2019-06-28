package com.lizs.pattern.observer;

public class Publisher{

    public void add(){
        System.out.println("perform add method");
        EventListener.trigger(EventType.ADD);
    }

    public void  remove(){
        System.out.println("perform remove method");
        EventListener.trigger(EventType.REMOVE);
    }
}
