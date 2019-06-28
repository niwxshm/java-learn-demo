package com.lizs.pattern.Factory;

public class YilyFactory implements IMilkFactory {
    @Override
    public Milk getMilk() {
        return new YiLy();
    }
}
