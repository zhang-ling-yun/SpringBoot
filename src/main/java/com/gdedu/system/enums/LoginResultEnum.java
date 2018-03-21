package com.gdedu.system.enums;

public enum LoginResultEnum {
    SUCCESS(0, "登录成功"),
    NOT_EXIST(1, "用户名不存在"),
    NOT_MATCH(2, "用户名和密码不匹配");
    private int code;
    private String message;

    LoginResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
