package cn.wz.demo;


import cn.wz.pojo.Empolyee;
import cn.wz.service.EmpolyeeService;
import cn.wz.service.impl.EmpolyeeServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapper {
    @Autowired
    private EmpolyeeServiceImpl service;

    @Test
    public void queryAll() {
        List<Empolyee> list = service.queryAll();
        for (Empolyee empolyee : list) {
            System.out.println(empolyee);
        }
    }

    @Value("${test.springboot_mybatisTest}")
    String test;
    @Test
    public void testValue() {
        System.out.println(test);
    }
}
