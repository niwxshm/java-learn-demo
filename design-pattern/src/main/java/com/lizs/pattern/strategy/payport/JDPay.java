package com.lizs.pattern.strategy.payport;

public class JDPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用京东白条支付");
        System.out.println("查看看余额是否足够");
        return new PayState(0, amount, "京东白条支付成功");
    }
}
