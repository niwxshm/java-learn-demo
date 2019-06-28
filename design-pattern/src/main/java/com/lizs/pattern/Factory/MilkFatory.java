package com.lizs.pattern.Factory;

public class MilkFatory extends AbtractMilkFactory {
    @Override
    public Milk getMengNiuMilk() {
        return new MengNiu();
    }

    @Override
    public Milk getYiLyMilk() {
        return new YiLy();
    }

    @Override
    public Milk getTeLunSuMilk() {
        return new TeLunSu();
    }
}
