package com.tasche.springbootlearning.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。
 * 在配置类中使用Profile注解类或者方法达到不同情况下选择实例化不同的Bean。
 * 1. 先将活动的Profile设置为prod
 * 2. 后置注册Bean的配置文件，不然会报Bean未定义的错误
 * 3. 刷新Spring容器
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }
}
