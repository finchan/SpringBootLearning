package com.tasche.springbootlearning.spring.initanddestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean声明周期提供Java配置和注解配置
 * 1. Java配置方式：使用@Bean的initMethod和destroyMethod，就是在配置类里提供
 * 相当于xml配置的
 * <bean id="exampleInitBean" class="examples.ExampleBean" init-method="init"/>
 * <bean id="exampleInitBean" class="examples.ExampleBean" destroy-method="cleanup"/>
 * 2. 注解方式：利用JSR-250的@PostConstruct和@PreDestroy，但需要使用Maven引入：
 *         <dependency>
 *             <groupId>javax.annotation</groupId>
 *             <artifactId>jsr250-api</artifactId>
 *             <version>1.0</version>
 *         </dependency>
 * @PostConstruct在构造函数执行完后执行
 * @PreDestroy在Bean销毁之前执行
 */
public class Main {
    public static void main(String [] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PrePostConfig.class);
        context.close();
    }
}
