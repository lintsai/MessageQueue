package com.example.rocketmq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息生產者
 */
@Component("producerService")
public class ProducerService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 發送簡單消息
     */
    public void sendMessage(){
        for(int i=0;i<1000;i++){
            rocketMQTemplate.convertAndSend("java1234-rocketmq","rocketmq大爺，你好！"+i);
        }
    }
}