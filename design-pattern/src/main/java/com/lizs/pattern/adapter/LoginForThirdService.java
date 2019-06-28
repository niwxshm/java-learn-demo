package com.lizs.pattern.adapter;

public class LoginForThirdService implements ThirdLoginService {

    LoginService loginService;
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
}
