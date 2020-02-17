package com.tasche.springbootlearning.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 默认的Spring Bean定义，不提供@Scope，它的默认值是singleton
 * @Scope描述Spring容器如何新建Bean实例
 * @Scope("singleton") - 默认设置，可以不提供，一个Spring容器只有一个Bean实例
 * @Scope("prototype") - 每次调用新建一个Bean的实例
 * @Scope("request") - WEB项目中，给每一个http request新建一个Bean实例
 * @Scope("session") - WEB项目中，给每一个http session新建一个Bean实例
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1= context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2= context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等：" +s1.equals(s2));
        System.out.println("p1与p2是否相等：" +p1.equals(p2));
    }
}
