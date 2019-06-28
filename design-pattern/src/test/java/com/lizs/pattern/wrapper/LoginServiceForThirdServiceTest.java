package com.lizs.pattern.wrapper;

import com.lizs.pattern.adapter.LoginService;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceForThirdServiceTest {

    private static LoginForThirdService loginForThirdService;
    @BeforeClass
    public static void  before(){
        loginForThirdService = new LoginForThirdService(new LoginService());
    }

    @Test
    public void loginForQQ() {
        System.out.println(loginForThirdService.loginForQQ("qq login"));
    }

    @Test
    public void loginForWechat() {
        System.out.println(loginForThirdService.loginForWechat("wechat login"));
    }

    @Test
    public void loginForToken() {
        System.out.println(loginForThirdService.loginForToken("token login"));
    }

    @Test
    public void login() {
        System.out.println(loginForThirdService.login("lizs", "password"));
    }

    @Test
    public void register() {
        System.out.println(loginForThirdService.register("lizs", "password"));
    }
}