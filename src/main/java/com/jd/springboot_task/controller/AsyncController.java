package com.jd.springboot_task.controller;

import com.jd.springboot_task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;

    @GetMapping("/hello123")
    public String hello(){
      asyncService.hello();
      return "success";
    }
}
