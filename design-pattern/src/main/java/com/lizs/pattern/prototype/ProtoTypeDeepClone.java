package com.lizs.pattern.prototype;

import java.io.*;

public class ProtoTypeDeepClone implements Cloneable,Serializable {

    public Attribute attribute;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oop = new ObjectOutputStream(bos);
            oop.writeObject(this);
            oop.flush();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            ois.close();
            oop.close();
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return super.clone();
    }
}
