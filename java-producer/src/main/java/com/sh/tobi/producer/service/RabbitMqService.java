package com.sh.tobi.producer.service;

import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Service;

public interface RabbitMqService {

    public void sendMessage(String message);

    void receiveMessageListener(String message);
}
