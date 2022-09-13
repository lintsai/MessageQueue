package com.example.rocketmq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 排程消息生產者
 */
@Component("scheduledProducerService")
@EnableScheduling
public class ScheduledProducerService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 發送排程消息
     */
    @Scheduled(cron = "0/5 * *  * * ?")
    private void sendMsgToMq() {
        String str = "[Scheduled] Hello World..." + new Date();
        rocketMQTemplate.syncSend("scheduled", str);
    }

}