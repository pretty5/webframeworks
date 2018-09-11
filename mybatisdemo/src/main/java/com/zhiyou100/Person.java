package com.zhiyou100;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
*@ClassName:Person
 @Description:TODO
 @Author:
 @Date:2018/9/4 16:37 
 @Version:v1.0
*/
@Data

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }
}
