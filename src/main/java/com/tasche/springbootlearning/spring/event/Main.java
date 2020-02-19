package com.tasche.springbootlearning.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring的事件(Application Event)为Bean与Bean之间的消息通信提供了支持。
 * 一个Bean发布事件，一个Bean接收事件。
 * 1. 自定义个事件需要继承ApplicationEvent
 * 2. 自定义事件监听器，实现ApplicationListener，使用onApplicationEvent方法对消息进行接收处理
 * 3. 发布时间的Bean需要注入ApplicationContext，并通过ApplicationContext的publishEvent发布事件
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("Hello, Application Event");
        context.close();
    }
}
