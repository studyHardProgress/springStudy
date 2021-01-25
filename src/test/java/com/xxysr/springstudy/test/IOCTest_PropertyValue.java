package com.xxysr.springstudy.test;


import com.xxysr.springstudy.bean.Person;
import com.xxysr.springstudy.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
    @Test
    public void test01(){
        Person person = (Person) applicationContext.getBean("person");
//        person = new Person("张飞",18);
        System.out.println("=============");
        System.out.println(person.toString());
    }
}
