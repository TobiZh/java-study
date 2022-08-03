package com.sh.tobi.rabbitmq.consumer.service.impl;

import com.sh.tobi.rabbitmq.consumer.config.RabbitMQConfig;
import com.sh.tobi.rabbitmq.consumer.service.RabbitMqService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RabbitMqServiceImpl implements RabbitMqService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void receiveMessage() {

        String message= (String) amqpTemplate.receiveAndConvert(RabbitMQConfig.DIRECT_QUEUE);

        System.out.printf("信息 %s%n",message);
    }


    @Override
    @RabbitListener(queues = {RabbitMQConfig.DIRECT_QUEUE})
    public void receiveMessageListener(String message) {

        System.out.println("1接收到："+message);
    }

    @Override
    @RabbitListener(queues = {RabbitMQConfig.DIRECT_QUEUE})
    public void receiveMessageListener2(String message) {

        System.out.println("2接收到："+message);
    }
}
