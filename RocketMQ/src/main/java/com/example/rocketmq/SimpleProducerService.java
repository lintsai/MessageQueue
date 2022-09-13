package com.example.rocketmq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 簡單消息生產者
 */
@Component("simpleProducerService")
public class SimpleProducerService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 發送簡單消息
     */
    public void sendMessage() {
        for(int i=0;i<1000;i++){
            rocketMQTemplate.convertAndSend("simple","[Send] Hello World..."+i);
        }
    }
}