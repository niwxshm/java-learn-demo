package com.lizs.pattern.strategy;

import com.lizs.pattern.strategy.payport.PayState;
import com.lizs.pattern.strategy.payport.PayType;
import com.lizs.pattern.strategy.payport.Payment;

public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(PayType payType) {
        return payType.getPayment().pay(this.uid, this.amount);
    }
}
