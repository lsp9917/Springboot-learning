package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 14:52]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 14:52]
 * @updateRemark : [说明本次修改内容]
 */
@AllArgsConstructor
@Getter
@Setter
public class ResponseHelper {
    private String code;
    private String message;
    private Object data;



//    public ResponseHelper(StatusCodeEnum codeEnum) {
//        this.code = codeEnum.getCode();
//        this.message = codeEnum.getMessage();
//    }
//    public ResponseHelper setData(Object data) {
//        this.data = data;
//        return this;
//
//    }

        public ResponseHelper(StatusCodeEnum codeEnum, Object data) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
        this.data = data;
    }

    public static ResponseHelper success() {
        return new ResponseHelper(StatusCodeEnum.SUCCESS,null);
    }
    public static ResponseHelper success(Object data) {
        return new ResponseHelper(StatusCodeEnum.SUCCESS,data);
    }
    public static ResponseHelper fail(StatusCodeEnum codeEnum) {
        return new ResponseHelper(codeEnum, null);
    }
    public static ResponseHelper fail(StatusCodeEnum codeEnum, Object data) {
        return new ResponseHelper(codeEnum, data);
    }
}
