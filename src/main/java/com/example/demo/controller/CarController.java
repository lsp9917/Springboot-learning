package com.example.demo.controller;

import com.example.demo.mapper.CarMapper;
import com.example.demo.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 11:13]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 11:13]
 * @updateRemark : [说明本次修改内容]
 */

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarMapper CarMapper;

    @GetMapping("/getCar")
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList = CarMapper.getCarList();
        return carList;
    }
}
