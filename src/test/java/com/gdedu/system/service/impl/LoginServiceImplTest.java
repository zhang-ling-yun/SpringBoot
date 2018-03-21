package com.gdedu.system.service.impl;

import com.gdedu.system.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceImplTest {

    @Autowired
    private LoginService loginService;

    @Test
    public void loginByStudent() {
        int sno = 1506300052;
        String spwd = "19960610";
        //成功测试
        System.out.println(loginService.loginByStudent(sno, spwd).getMessage());

        //帐号不存在
        sno = 150;
        System.out.println(loginService.loginByStudent(sno, spwd).getMessage());

        //帐号密码不匹配
        sno = 1506300052;
        spwd = "123456";
        System.out.println(loginService.loginByStudent(sno, spwd).getMessage());

    }

    @Test
    public void loginByManager() {
        int tno = 103159;
        String tpwd = "123456";
        //成功测试
        System.out.println(loginService.loginByManager(tno, tpwd).getMessage());

        //帐号不存在
        tno = 150;
        System.out.println(loginService.loginByManager(tno, tpwd).getMessage());

        //帐号密码不匹配
        tno = 103159;
        tpwd = "12";
        System.out.println(loginService.loginByManager(tno, tpwd).getMessage());
    }
}