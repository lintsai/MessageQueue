package com.example.rocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RocketMqApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RocketMqApplication.class, args);
        ProducerService producerService = (ProducerService) run.getBean("producerService");
        producerService.sendMessage();
    }
}
