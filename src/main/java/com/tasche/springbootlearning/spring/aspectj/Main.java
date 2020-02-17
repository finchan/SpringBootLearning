package com.tasche.springbootlearning.spring.aspectj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 关于Spring & Aspect具体参见 -
 * https://docs.spring.io/spring/docs/4.3.26.RELEASE/spring-framework-reference/htmlsingle/#aop
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService =
                context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();

        DemoMethodService demoMethodService =
                context.getBean(DemoMethodService.class);
        demoMethodService.add();
        context.close();
    }
}
