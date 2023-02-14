package com.example.demo.common;

import lombok.Data;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 13:43]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 13:43]
 * @updateRemark : [说明本次修改内容]
 */


public enum StatusCodeEnum{
    SUCCESS("200","请求成功"),
    FAILED("400","请求失败"),
    NOT_FOUND("404","接口不存在"),
    SERVER_ERROR("500","服务器内部出错");


    private String code;
    private String message;
    public String getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
     StatusCodeEnum(String code, String message){
        this.code = code;
        this.message = message;
    }
}