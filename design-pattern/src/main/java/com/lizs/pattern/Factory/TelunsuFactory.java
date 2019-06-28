package com.lizs.pattern.Factory;

public class TelunsuFactory implements IMilkFactory{
    @Override
    public Milk getMilk() {
        return new TeLunSu();
    }
}
