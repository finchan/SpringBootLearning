package com.tasche.springbootlearning.spring.aspectj;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    /**
     * 编写使用注解的被拦截类
     */
    @Action(name="DemoAnnotationService > add METHOD")
    public void add(){}
}
