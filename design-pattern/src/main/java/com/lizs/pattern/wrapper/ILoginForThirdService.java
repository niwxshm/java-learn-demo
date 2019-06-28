package com.lizs.pattern.wrapper;

import com.lizs.pattern.adapter.ResultMsg;

public interface ILoginForThirdService extends ILoginService {
    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);
}
