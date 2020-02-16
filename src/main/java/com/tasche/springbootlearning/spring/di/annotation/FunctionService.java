package com.tasche.springbootlearning.spring.di.annotation;

import org.springframework.stereotype.Service;

/**
 * 下列注解是等效的表明是Spring管理的一个Bean
 * @Component
 * @Service
 * @Repository
 * @Controller
 * 但是@Bean注解在方法上，生命当前方法返回值为一个Bean
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + "!";
    }
}
