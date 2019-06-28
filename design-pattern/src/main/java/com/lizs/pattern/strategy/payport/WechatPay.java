package com.lizs.pattern.strategy.payport;

public class WechatPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("查看看余额是否足够");
        return new PayState(0, amount, "微信支付成功");
    }
}
