package com.zhiyou100.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit4 spring的配置文件的地址
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class MutipleDataSourceStudentServiceTest {
    @Autowired
    MutipleDataSourceStudentService mutipleDataSourceStudentService;

    @Test
    public void test1() {
        mutipleDataSourceStudentService.test();

    }

}