package com.example.rocketmq;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * 排隊消息消費者
 */
@RocketMQMessageListener(topic = "queue",consumerGroup ="queue-group" )
@Component
public class QueueConsumerService implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        System.out.println("Get Message："+s);
    }
}