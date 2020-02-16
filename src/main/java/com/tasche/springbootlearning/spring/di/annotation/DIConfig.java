package com.tasche.springbootlearning.spring.di.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration生命当前类为一个配置类，它相当于一个Spring的xml文件
//@ComponentScan自动扫描对应包下所有使用@Service, @Component, @Repository, @Controller
@Configuration
@ComponentScan("com.tasche.springbootlearning.spring.di")
public class DIConfig {
}
