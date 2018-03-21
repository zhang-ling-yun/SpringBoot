package com.gdedu.system.dto;

import com.gdedu.system.enums.StudentReturnResultEnum;

public class StudentReturnResult {
    private int code;
    private String message;

    public StudentReturnResult(StudentReturnResultEnum studentReturnResultEnum) {
        this.code = studentReturnResultEnum.getCode();
        this.message = studentReturnResultEnum.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
