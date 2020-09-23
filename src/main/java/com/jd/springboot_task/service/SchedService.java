package com.jd.springboot_task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedService {

    @Scheduled(cron = "0 * * * * MON-SAT")
    public void hello(){
        System.out.println("hello...");
    }
}
