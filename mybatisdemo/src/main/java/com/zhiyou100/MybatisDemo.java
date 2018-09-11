package com.zhiyou100;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
*@ClassName:MybatisDemo
 @Description:TODO
 @Author:YF
 @Date:2018/9/4 16:23 
 @Version:v1.0

*/
public class MybatisDemo {
  static   String resource = "mybatis-config.xml";
    //创建一个sqlsessionFactory对象  用来获取sqlsession
  static   InputStream inputStream;

    static {
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static SqlSessionFactory sqlSessionFactory =
            new SqlSessionFactoryBuilder().build(inputStream);
    static SqlSession session = sqlSessionFactory.openSession();
    public static void main(String[] args) throws IOException {
        //mybatis配置文件路径
        String resource = "mybatis-config.xml";
       //创建一个sqlsessionFactory对象  用来获取sqlsession
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
       //打开一个会话
        SqlSession session = sqlSessionFactory.openSession();
        //获取mapper mapper 是dao的实现
        PersonDao personDao = session.getMapper(PersonDao.class);



       //personDao.insert(new Person(2018,"jerry"));

       //session.commit();

        //Person person = personDao.findById(2018);
        //System.out.println(person);
            findById();
        //oneTOMany();
    }
    private static  void findById() throws IOException {

     StudentDao studentDaoDao = session.getMapper(StudentDao.class);
        Student student = studentDaoDao.findById(1);
        System.out.println(student);
    }
    private static  void  oneTOMany(){
        GradeDao gradeDao=session.getMapper(GradeDao.class);
        Grade grade = gradeDao.findById(1);
        System.out.println(grade);
    }
}
