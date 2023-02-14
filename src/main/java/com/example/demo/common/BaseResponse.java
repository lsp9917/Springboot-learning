package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 15:02]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 15:02]
 * @updateRemark : [说明本次修改内容]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {
    private String code;
    private String message;
    private T data;


}
