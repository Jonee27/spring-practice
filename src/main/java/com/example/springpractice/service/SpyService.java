package com.example.springpractice.service;

import org.springframework.stereotype.Service;

@Service("spying")
public class SpyService {

    public String iSaySomething() {
        return "I am a spy!";
    }
}
