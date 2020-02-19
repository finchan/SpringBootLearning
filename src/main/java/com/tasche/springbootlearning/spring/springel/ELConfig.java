package com.tasche.springbootlearning.spring.springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * 1. 配置文件也可以从context.getBean中获取
 * 2. 使用配置文件需要使用@PropertySource指定文件地址
 * 3. 如果使用@Value注入properties文件，需要配置一个PropertySourcesPlaceholderConfigurer的Bean。注意这里只有Properties是使用$
 * @Value 1. 注入普通字符串
 * @Value 2. 注入操作系统属性
 * @Value 3. 注入表达式结果
 * @Value 4. 注入其他Bean属性
 * @Value 5. 注入文件资源
 * @Value 6. 注入网址资源
 * @Value 7. 注入配置文件
 * @Value 8. 可以通过Environment注入配置资源
 */
@Configuration
@ComponentScan("com.tasche.springbootlearning.spring.springel")
@PropertySource("classpath:com/tasche/springbootlearning/spring/springel/test.properties")
public class ELConfig {
    @Value("I love you!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:com/tasche/springbootlearning/spring/springel/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testURL;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testURL.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
