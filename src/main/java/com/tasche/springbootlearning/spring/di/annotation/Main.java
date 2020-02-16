package com.tasche.springbootlearning.spring.di.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext作为一个Spring容器
        //接收输入一个配置类作为参数
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DIConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("Annotation DI"));
        context.close();
    }
}
