package com.xxysr.springstudy.bean;

import org.springframework.beans.factory.annotation.Value;


public class Person {

    //使用@Value赋值；
    //1、基本数值
    //2、可以写SpEL； #{}
    //3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）

    @Value("张飞")
    private String name;
    @Value("#{20-4}")
    private Integer age;

    @Value("${person.nickName}")
    private String nickName;


    public Person() {
//        super();
    }

    public Person(String name, Integer age) {
//        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
