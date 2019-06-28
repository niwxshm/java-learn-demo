package com.lizs.pattern.strategy.payport;

public interface Payment {
   public  PayState pay(String uid, double amount);
}
