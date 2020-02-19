package com.tasche.springbootlearning.spring.initanddestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 如果JSR250WayService直接在定义该类上使用@Service或者其他三个Bean注解
 * 这里只需要使用ComponentScan扫描该Bean并自动进行初始化
 */
@Configuration
//@ComponentScan("com.tasche.springbootlearning.spring.initanddestroy")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
