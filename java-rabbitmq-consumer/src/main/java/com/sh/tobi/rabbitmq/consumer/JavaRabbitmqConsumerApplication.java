package com.sh.tobi.rabbitmq.consumer;

import com.sh.tobi.rabbitmq.consumer.service.RabbitMqService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaRabbitmqConsumerApplication {

    public static void main(String[] args) {
        ApplicationContext ac=SpringApplication.run(JavaRabbitmqConsumerApplication.class, args);

        RabbitMqService rabbitMqService=ac.getBean(RabbitMqService.class);
        rabbitMqService.receiveMessage();
    }

}
