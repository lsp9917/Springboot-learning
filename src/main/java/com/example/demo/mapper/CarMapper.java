package com.example.demo.mapper;

import com.example.demo.pojo.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 9:51]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 9:51]
 * @updateRemark : [说明本次修改内容]
 */

/*加了这个注解 就表示了 这是一个Mybatis的mapper类
就相当于之前使用的spring整合mybatis接口 也可以使用@MapperScan("com.example.demo.mapper")*/

@Repository
public interface CarMapper {
    List<Car> getCarList();
}
