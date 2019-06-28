package com.lizs.pattern.Factory;

public class SimpleFactory {
    public Milk getMilk(String name) {
        switch (name) {
            case "YiLi":
                return new YiLy();
            case "MengNiu":
                return new MengNiu();
            case "TeLunSu":
                return new TeLunSu();
            default:
                throw new RuntimeException("unsupported milk name:" + name);
        }
    }
}
