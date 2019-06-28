package com.lizs.pattern.proxy.jdk;

public class XiaoMing implements Someone {
    @Override
    public void findLove() {
        System.out.println("我是someone,我想找一个好老婆");
    }

    @Override
    public void findJob() {
        System.out.println("我想找月薪两万的工作");
    }
}
