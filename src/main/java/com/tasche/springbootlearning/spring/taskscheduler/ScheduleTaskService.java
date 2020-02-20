package com.tasche.springbootlearning.spring.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次：" +dateFormat.format(new Date()));
    }

    //UNIX CRON定时规则
    @Scheduled(cron="0 4 12 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定的时间 " + dateFormat.format(new Date()) + "执行");
    }

}
