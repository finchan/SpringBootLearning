package com.tasche.springbootlearning.spring.compositionannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //组合@Configuration原注解
@ComponentScan   //组合@ComponentScan原注解
public @interface WiselyConfiguration {
    String [] value() default {};
}
