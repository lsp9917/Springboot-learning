package com.example.demo.common;

import lombok.Data;
import lombok.ToString;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 13:43]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 13:43]
 * @updateRemark : [说明本次修改内容]
 */

public enum BaseCodeEnum implements BaseCodeInfoInterface {
    SUCCESS("200","成功！"),
    BOOY_NOT_MATCH("400","数据格式不匹配或参数异常"),
    NO_AUTHORIZED("401","未查询到登录信息或无权进行此操作"),
    NOT_FOUND("404","访问资源不存在"),
    INTERNAL_SERVER_ERROR("500","服务器内部错误"),
    ASSERT("400","ASSERT抛出异常！");


    private String code;
    private String message;
    BaseCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}