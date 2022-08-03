package com.sh.tobi.mq.rocket.producer;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

public class MqTest {

    public static void main(String[] args) {
        // Send string
        RocketMQTemplate rocketMQTemplate=new RocketMQTemplate();
        SendResult sendResult = rocketMQTemplate.syncSend("springTopic", "Hello, World!");
        System.out.printf("syncSend1 to topic %s sendResult=%s %n", "springTopic", sendResult);

    }
}
