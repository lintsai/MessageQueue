package com.example.rocketmq;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 排程消息消費者
 */
@RocketMQMessageListener(topic = "scheduled",consumerGroup ="scheduled-group" )
@Component
public class ScheduledConsumerService implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Get Message["+ new Date() +"]："+s);
    }
}