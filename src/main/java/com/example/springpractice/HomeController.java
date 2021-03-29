package com.example.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private SpyService spyService;

    @RequestMapping("/")
    public String index() {
//        return "<h1>Hello World!</h1>";
        return String.format("<h1>%s</h1>", spyService.iSaySomething());
    }

    @Autowired
    public void setSpyService(SpyService spyService) {
        this.spyService = spyService;
    }
}
