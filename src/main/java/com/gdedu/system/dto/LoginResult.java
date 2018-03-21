package com.gdedu.system.dto;

import com.gdedu.system.enums.LoginResultEnum;

/**
 * 登录返回结果封装传输类
 */
public class LoginResult {
    private int code;
    private String message;

    public LoginResult(LoginResultEnum loginResultEnum) {
        this.code = loginResultEnum.getCode();
        this.message = loginResultEnum.getMessage();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
