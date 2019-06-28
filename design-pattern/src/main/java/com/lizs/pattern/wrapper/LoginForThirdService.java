package com.lizs.pattern.wrapper;

import com.lizs.pattern.adapter.LoginService;
import com.lizs.pattern.adapter.ResultMsg;

public class LoginForThirdService implements ILoginForThirdService {

    private LoginService loginService;

    public LoginForThirdService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public ResultMsg loginForQQ(String openId) {
        String username = openId;
        String password = openId + "QQ";

        loginService.register(username, password);
        return loginService.login(username, password);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        String username = openId;
        String password = openId + "Wechat";

        loginService.register(username, password);
        return loginService.login(username, password);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        String username = token;
        String password = token + "Token";

        loginService.register(username, password);
        return loginService.login(username, password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return loginService.login(username,password);
    }

    @Override
    public ResultMsg register(String username, String password) {
        return loginService.register(username, password);
    }
}
