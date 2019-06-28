package com.lizs.pattern.adapter;

import com.lizs.pattern.wrapper.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public ResultMsg login(String username, String password) {
        System.out.println("login by username:" + username + " and password:" + password);
        return new ResultMsg(0, "login success", null);
    }

    @Override
    public ResultMsg register(String username, String password) {
        System.out.println("register by username:" + username + " and password:" + password);
        return new ResultMsg(0, "register success", null);
    }
}
