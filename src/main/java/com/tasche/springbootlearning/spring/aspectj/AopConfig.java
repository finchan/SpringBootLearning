package com.tasche.springbootlearning.spring.aspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持
 */
@Configuration
@ComponentScan("com.tasche.springbootlearning.spring.aspectj")
@EnableAspectJAutoProxy
public class AopConfig {
}
