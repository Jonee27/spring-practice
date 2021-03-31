package com.example.springpractice.controller;

import com.example.springpractice.service.SpyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private SpyService spyService;

    @Value("${HomeController.msg}")
    private String message;

    @RequestMapping("/")
    public String index() {
        return message;
//        return "<h1>Hello World!</h1>";
//        return String.format("<h1>%s</h1>", spyService.iSaySomething());
    }

    @Autowired
    public void setSpyService(SpyService spyService) {
        this.spyService = spyService;
    }
}
