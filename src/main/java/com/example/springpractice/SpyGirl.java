package com.example.springpractice;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class SpyGirl {

    public String iSaySomething() {
        return "I am a spy!";
    }
}
