package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan


//Kiváltja a fenti 3 annotációt
//@ComponentScan({"com.example.springpractice", "com.example.springpractice.spy"})
@SpringBootApplication
@EnableConfigurationProperties
public class SpringpracticeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringpracticeApplication.class, args);
        System.out.println(context.getBean("person"));
    }

}

