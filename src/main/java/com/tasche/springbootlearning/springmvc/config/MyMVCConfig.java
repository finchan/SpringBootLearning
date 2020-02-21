package com.tasche.springbootlearning.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @EnableWebMvc注解会开启一些默认配置，如一些ViewResolver或者MessageConverter等
 * Spring MVC里有一个接口叫做ViewResolver（我们的ViewResolver都实现该接口），
 * 实现这个接口要重写resolveViewName()，这个方法的返回值是接口View，
 * 而View的职责就是使用model、request、response对象，并渲染视图（不一定是
 * html，可能是json, xml, pdf）返回给浏览器。
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.tasche.springbootlearning.springmvc")
public class MyMVCConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }
}
