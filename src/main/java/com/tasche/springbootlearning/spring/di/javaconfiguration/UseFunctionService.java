package com.tasche.springbootlearning.spring.di.javaconfiguration;

import org.springframework.context.annotation.Bean;

public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
