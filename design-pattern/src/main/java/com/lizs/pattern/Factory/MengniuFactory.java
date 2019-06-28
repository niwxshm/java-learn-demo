package com.lizs.pattern.Factory;

public class MengniuFactory implements IMilkFactory {
    @Override
    public Milk getMilk() {
        return new MengNiu();
    }
}
