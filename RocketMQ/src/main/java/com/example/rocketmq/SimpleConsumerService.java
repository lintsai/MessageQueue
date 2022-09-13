package com.example.rocketmq;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * 簡單消息消費者
 */
@RocketMQMessageListener(topic = "simple",consumerGroup ="simple-group" )
@Component
public class SimpleConsumerService implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        System.out.println("Get Message："+s);
    }
}