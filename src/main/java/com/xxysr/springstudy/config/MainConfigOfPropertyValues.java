package com.xxysr.springstudy.config;

import com.xxysr.springstudy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource(value="classpath:application.properties",encoding = "UTF-8")
@Configuration
public class MainConfigOfPropertyValues {
    @Bean("person")
    public Person person(){
        return new Person();
    }
}
