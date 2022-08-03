package com.sh.tobi.producer.service.impl;

import com.sh.tobi.producer.config.RabbitMQConfig;
import com.sh.tobi.producer.service.RabbitMqService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RabbitMqServiceImpl implements RabbitMqService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMessage(String message) {
        amqpTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE,RabbitMQConfig.DIRECT_ROUTINGKEY,message);
    }

    @Override
    @RabbitListener(queues = {RabbitMQConfig.DIRECT_QUEUE})
    public void receiveMessageListener(String message) {
        System.out.println("发送服务的"+message);
    }
}
