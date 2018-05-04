package com.prototype.model.enums;

public enum CustomException {
    UNKNOW_ERROR(-1, "未知错误"),
    USERNAME_OR_PASSWORD_ERROR(10001, "用户名或密码错误");

    private Integer code;

    private String msg;

    CustomException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
