package com.example.springpractice;

import org.springframework.stereotype.Service;

@Service
public class SpyService {

    public String iSaySomething() {
        return "I am a spy!";
    }
}
