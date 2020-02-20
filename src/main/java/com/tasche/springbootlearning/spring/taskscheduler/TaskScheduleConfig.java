package com.tasche.springbootlearning.spring.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.tasche.springbootlearning.spring.taskscheduler")
@EnableScheduling
public class TaskScheduleConfig {
}
