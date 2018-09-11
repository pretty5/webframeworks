package com.zhiyou100;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Grade {
    private  int id;
    private  String name;
    private List<Student> studentList;
    public Grade() {
    }
}
