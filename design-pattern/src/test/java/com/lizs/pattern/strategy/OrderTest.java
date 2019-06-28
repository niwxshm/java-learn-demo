package com.lizs.pattern.strategy;

import com.lizs.pattern.strategy.payport.PayState;
import com.lizs.pattern.strategy.payport.PayType;
import com.lizs.pattern.strategy.payport.WechatPay;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void pay() {
        Order order = new Order("1","2019062233",66.66);
        PayState pay = order.pay(PayType.JD_PAY);
        System.out.println(pay);
    }
}