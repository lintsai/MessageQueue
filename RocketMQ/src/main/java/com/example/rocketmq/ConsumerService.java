package com.example.rocketmq;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * 消息消費者
 */
@RocketMQMessageListener(topic = "java1234-rocketmq",consumerGroup ="${rocketmq.consumer.group}" )
@Component
public class ConsumerService implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        System.out.println("收到消息內容："+s);
    }
}