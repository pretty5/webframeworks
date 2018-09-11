package com.zhiyou100.transaction;

import com.zhiyou100.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
*@ClassName:MutipleDataSourceStudentService
 @Description:TODO
 @Author:
 @Date:2018/9/10 10:55 
 @Version:v1.0
*/
@Service
public class MutipleDataSourceStudentService {
    @Autowired
    com.zhiyou100.dao1.StudentMapper1 studentMapper1;
    @Autowired
    com.zhiyou100.dao2.StudentMapper2 studentMapper2;
    @Transactional
    public void test(){
        Student jack = new Student();
        jack.setAge(18);
        jack.setName("jack");
        studentMapper1.insert(jack);
        //System.out.println(1/0);
        studentMapper2.insert(jack);
    }
}
