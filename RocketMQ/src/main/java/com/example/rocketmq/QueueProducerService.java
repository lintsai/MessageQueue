package com.example.rocketmq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 排隊消息生產者
 */
@Component("queueProducerService")
public class QueueProducerService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 發送排隊消息
     */
    public void sendMessage() {
        for(int i=0;i<1000;i++){
            rocketMQTemplate.syncSendOrderly("queue","[Queue]Hello World..."+i, "Order"+i);
        }
    }
}