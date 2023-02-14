package com.example.demo.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 9:42]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 9:42]
 * @updateRemark : [说明本次修改内容]
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car implements Serializable {
    private Long id;
    private String carName;
    private String brand;
    private Double guidePrice;
    private String produceTime;
    private String carType;
}
