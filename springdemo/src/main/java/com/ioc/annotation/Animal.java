package com.ioc.annotation;

/*
*@ClassName:Animal
 @Description:TODO
 @Author:
 @Date:2018/9/3 14:19 
 @Version:v1.0
*/

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component(value = "dog")
public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
