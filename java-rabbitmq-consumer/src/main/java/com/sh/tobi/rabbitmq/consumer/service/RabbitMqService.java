package com.sh.tobi.rabbitmq.consumer.service;

public interface RabbitMqService {

    void receiveMessage();

    void receiveMessageListener(String message);

    void receiveMessageListener2(String message);
}
