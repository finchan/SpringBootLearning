package com.tasche.springbootlearning.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 利用@Controller注解声明一个控制器
 * 利用@RequestMapping配置URL和方法之间的映射
 * 通过上面的ViewResolver的Bean配置，返回值为index
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
