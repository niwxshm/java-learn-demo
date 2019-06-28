package com.lizs.pattern.adapter;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class LoginForThirdServiceTest {

    private static LoginForThirdService loginForThirdService;
    @BeforeClass
    public static void  before(){
        loginForThirdService = new LoginForThirdService(new LoginService());
    }

    @Test
    public void loginForQQ() {
        System.out.println(loginForThirdService.loginForQQ("dasfgfasgasd"));
    }

    @Test
    public void loginForWechat() {
        System.out.println(loginForThirdService.loginForWechat("dfafgagd"));
    }

    @Test
    public void loginForToken() {
        System.out.println(loginForThirdService.loginForToken("fdasftea"));

    }
}