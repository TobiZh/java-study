package com.sh.tobi.producer;

import com.sh.tobi.producer.service.RabbitMqService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaProducerApplication {



    public static void main(String[] args) {
        ApplicationContext ac=SpringApplication.run(JavaProducerApplication.class, args);
        RabbitMqService rabbitMqService=ac.getBean(RabbitMqService.class);

        rabbitMqService.sendMessage("你好");
    }

}
