package com.lizs.pattern.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProtoTypeTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        ProtoTypeCloneByDefault protoTypeCloneByDefault = new ProtoTypeCloneByDefault();
        protoTypeCloneByDefault.attribute = new Attribute("name", 20);

        ProtoTypeCloneByDefault newObject = (ProtoTypeCloneByDefault) protoTypeCloneByDefault.clone();

        System.out.println(protoTypeCloneByDefault.attribute == newObject.attribute);
    }

    @Test
    public void deepCloneTest() throws CloneNotSupportedException {
        ProtoTypeDeepClone protoTypeDeepClone = new ProtoTypeDeepClone();
        protoTypeDeepClone.attribute = new Attribute("name", 20);

        ProtoTypeDeepClone newObject = (ProtoTypeDeepClone) protoTypeDeepClone.clone();

        System.out.println(protoTypeDeepClone.attribute == newObject.attribute);
    }

}