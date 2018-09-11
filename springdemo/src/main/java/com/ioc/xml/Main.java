package com.ioc.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //初始化工厂
        //
        ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("appContext.xml");
      //从工厂中获取对象
        Person tom=(Person) factory.getBean("tom");
        tom.sayHello();
        System.out.println(tom.getName());
        System.out.println(tom.getAge());
        Person rose=(Person) factory.getBean("rose");
        System.out.println(rose.getAge());
        System.out.println(rose.getFriend().getName());
    }
}
