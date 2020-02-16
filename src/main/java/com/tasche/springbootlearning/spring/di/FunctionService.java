package com.tasche.springbootlearning.spring.di;

import org.springframework.stereotype.Service;

/**
 * 下列注解是等效的表明是Spring管理的一个Bean
 * @Component
 * @Service
 * @Repository
 * @Controller
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + "!";
    }
}
