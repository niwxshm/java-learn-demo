package com.lizs.pattern.Factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class MilkFatoryTest {

    @Test
    public void testSimpleFactory() {
        SimpleFactory factory = new SimpleFactory();
        Milk milk = factory.getMilk("MengNiu");
        assertEquals("MengNiu", milk.getName());

        milk = factory.getMilk("YiLi");
        assertEquals("YiLi", milk.getName());

        milk = factory.getMilk("TeLunSu");
        assertEquals("TeLunSu", milk.getName());

    }

    @Test
    public void testFactoryMethod() {
        IMilkFactory factory = new MengniuFactory();
        Milk milk = factory.getMilk();
        assertEquals("MengNiu", milk.getName());

        factory = new YilyFactory();
        milk = factory.getMilk();
        assertEquals("YiLi", milk.getName());

        factory = new TelunsuFactory();
        milk = factory.getMilk();
        assertEquals("TeLunSu", milk.getName());

    }

    @Test
    public void testAbstractFactory() {
        MilkFatory factory = new MilkFatory();
        Milk milk = factory.getMengNiuMilk();
        assertEquals("MengNiu", milk.getName());

        milk = factory.getYiLyMilk();
        assertEquals("YiLi", milk.getName());

        milk = factory.getTeLunSuMilk();
        assertEquals("TeLunSu", milk.getName());

    }

}