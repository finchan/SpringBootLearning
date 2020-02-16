package com.tasche.springbootlearning.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UseFunctionService {

    @Autowired
    /**
     * @Autowired将FunctionService的实体Bean注入UseFunctionService中
     * @Autowired满足JSR-330的@Inject注解
     * 此处也可以使用@Resource注解
     * @Resource注解是JSR-250规范的，这两处注解是等效的
     */
            FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
