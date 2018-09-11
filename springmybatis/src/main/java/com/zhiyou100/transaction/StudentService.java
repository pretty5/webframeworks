package com.zhiyou100.transaction;

import com.zhiyou100.dao.StudentMapper;
import com.zhiyou100.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/*
*@ClassName:StudentService
 @Description:TODO
 @Author:
 @Date:2018/9/6 15:26 
 @Version:v1.0
*/

//@Service
public class StudentService {
    @Autowired
    StudentMapper studentDao;
    public Student findById(int id){
        Student student = studentDao.selectByPrimaryKey(id);
        return student;
    }
    //表明该方法是一个事务方法
    @Transactional
    public void insertTwo(){
        Student jack = new Student();
        jack.setAge(18);
        jack.setName("jack");

        Student tom = new Student();
        tom.setAge(18);
        tom.setName("tom");

        studentDao.insert(jack);
       // System.out.println(1/0);
        studentDao.insert(tom);


    }
    //@Transactional
    public void insertTwo2(){
               Student jack = new Student();
        jack.setAge(18);
        jack.setName("jack");

        Student tom = new Student();
        tom.setAge(18);
        tom.setName("tom");

        studentDao.insert(jack);


        insertTwo();

        System.out.println(1/0);
        studentDao.insert(tom);


    }


}
