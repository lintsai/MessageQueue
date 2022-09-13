package com.example.rocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RocketMqApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RocketMqApplication.class, args);
        SimpleProducerService simpleProducerService = (SimpleProducerService) run.getBean("simpleProducerService");
        simpleProducerService.sendMessage();
        QueueProducerService queueProducerService = (QueueProducerService) run.getBean("queueProducerService");
        queueProducerService.sendMessage();
    }
}
