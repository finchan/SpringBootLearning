package com.tasche.springbootlearning.spring.initanddestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    public JSR250WayService() {
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PostConstruct
    public void init() {
        System.out.println("JSR250-init-method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("JSR250-destroy-method");
    }
}
