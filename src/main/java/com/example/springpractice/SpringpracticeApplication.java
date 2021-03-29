package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan


//Kiváltja a fenti 3 annotációt
//@ComponentScan({"com.example.springpractice", "com.example.springpractice.spy"})
@SpringBootApplication
public class SpringpracticeApplication {

    public static void main(String[] args) {
        ApplicationContext ct = SpringApplication.run(SpringpracticeApplication.class, args);

        String[] beanArray = ct.getBeanDefinitionNames();
        Arrays.sort(beanArray);

        for (String name: beanArray){
            System.out.println(name);
        }
    }

}

