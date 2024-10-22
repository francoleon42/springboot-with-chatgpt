package com.poo.springbootwithchatgpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringBootWithChatgptApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithChatgptApplication.class, args);
    }

}
