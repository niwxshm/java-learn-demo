package com.lizs.pattern.prototype;

public class ProtoTypeCloneByDefault implements Cloneable {

    public Attribute attribute;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
