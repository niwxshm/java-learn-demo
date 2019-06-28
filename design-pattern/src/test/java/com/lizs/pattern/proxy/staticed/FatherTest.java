package com.lizs.pattern.proxy.staticed;

import com.lizs.pattern.proxy.Person;
import org.junit.Test;

public class FatherTest {

    @Test
    public void findLove() {
        Person person = new Son();
        Father father = new Father(person);
        father.findLove();
    }
}