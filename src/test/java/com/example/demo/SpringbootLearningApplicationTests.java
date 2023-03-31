package com.example.demo;

import com.example.demo.mapper.CarMapper;
import com.example.demo.pojo.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootLearningApplicationTests {

    @Autowired
    private CarMapper CarMapper;


    @Test
    void test01() {
        List<Car> carList= CarMapper.getCarList();
        System.out.println(carList);
    }


}
