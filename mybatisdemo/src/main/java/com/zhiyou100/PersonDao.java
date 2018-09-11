package com.zhiyou100;

public interface PersonDao {
    Person findById(int id);
    int insert(Person person);
}
