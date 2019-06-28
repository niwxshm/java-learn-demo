package com.lizs.pattern.strategy.payport;

public class AliPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝支付");
        System.out.println("查看看余额是否足够");
        return new PayState(0, amount, "支付宝支付成功");
    }
}
