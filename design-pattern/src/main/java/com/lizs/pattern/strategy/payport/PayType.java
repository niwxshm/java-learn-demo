package com.lizs.pattern.strategy.payport;

public enum PayType {
    ALI_PAY(new AliPay()), WECHAT_PAY(new WechatPay()), JD_PAY(new JDPay());
    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return this.payment;
    }
}