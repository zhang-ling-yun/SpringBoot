package com.gdedu.system.controller;

import com.gdedu.system.dto.LoginResult;
import com.gdedu.system.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 处理登录请求的Controller
 */
@Controller
@RequestMapping("")
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 登录界面,默认是学生登录
     *
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @PostMapping("/login/student")
    @ResponseBody
    public LoginResult loginByStudent(@RequestParam("sno") int sno, @RequestParam("spwd") String spwd) {
        return loginService.loginByStudent(sno, spwd);
    }

    @PostMapping("/login/manager")
    @ResponseBody
    public LoginResult loginByManager(@RequestParam("tno") int tno, @RequestParam("tpwd") String tpwd) {
        return loginService.loginByManager(tno, tpwd);
    }
}
