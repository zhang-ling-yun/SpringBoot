package com.gdedu.system.enums;

public enum StudentReturnResultEnum {
    INSERT_SUCCESS(0, "添加成功,数据库操作成功"),
    INSERT_FAIL(1, "添加失败,用户名已存在"),

    DELETE_SUCCESS(2, "删除成功,数据库操作成功"),
    DELETE_FAIL(3, "删除失败,用户名不存在"),

    UPDATE_SUCCESS(4, "修改成功,数据库操作成功"),
    UPDATE_FAIL(5, "修改失败,数据库操作失败");
    private int code;
    private String message;

    StudentReturnResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
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
