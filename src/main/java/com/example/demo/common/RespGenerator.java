package com.example.demo.common;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 14:52]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 14:52]
 * @updateRemark : [说明本次修改内容]
 */

public class RespGenerator {
    //    正常返回调用接口
    public static BaseResponse success(Object data){
        return new BaseResponse(BaseCodeEnum.SUCCESS.getCode(),"接口调用成功",data);
    }

    //    正常返回调用接口(无参)
    public static BaseResponse success_noData(String msg){
        return new BaseResponse(BaseCodeEnum.SUCCESS.getCode(),msg,null);
    }


    //    失败调用（入参异常枚举）
    public static  BaseResponse<Object> fail(BaseCodeEnum baseErrorEnum){
        return new BaseResponse<Object>(baseErrorEnum.getCode(),baseErrorEnum.getMessage(),null);
    }

    //    调用失败
    public static  BaseResponse<Object> fail(String code,String message){
        System.out.println(new BaseResponse<Object>(code,message,null).toString());
        return new BaseResponse<Object>(code,message,null);
    }

}
