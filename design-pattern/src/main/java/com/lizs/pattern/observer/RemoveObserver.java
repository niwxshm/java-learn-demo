package com.lizs.pattern.observer;

public class RemoveObserver implements Observer {
    @Override
    public void advice(Event event) {
        System.out.println("It is remove observer");
        System.out.println(event);
    }
}
