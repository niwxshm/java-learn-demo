package com.lizs.pattern.adapter;

public interface ThirdLoginService {
    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);
}
