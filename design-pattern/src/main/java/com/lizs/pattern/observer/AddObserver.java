package com.lizs.pattern.observer;

public class AddObserver implements Observer {
    @Override
    public void advice(Event event) {
        System.out.println("It is Add Observer");
        System.out.println(event);
    }
}
