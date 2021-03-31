package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan


//Kiváltja a fenti 3 annotációt
//@ComponentScan({"com.example.springpractice", "com.example.springpractice.spy"})
@SpringBootApplication
public class SpringpracticeApplication {

    @Bean
    public Person giveMeAPerson() {
        return new Person("Béla", 20);
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringpracticeApplication.class, args);

        String[] beanArray = context.getBeanDefinitionNames();
        Arrays.sort(beanArray);

        for (String name: beanArray){
            System.out.println(name);
        }
    }

}

