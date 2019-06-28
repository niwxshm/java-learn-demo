package com.lizs.pattern.prototype;

import java.io.Serializable;

public class Attribute implements Serializable {
    String name;
    int size;

    public Attribute(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
