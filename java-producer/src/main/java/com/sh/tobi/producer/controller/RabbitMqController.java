package com.sh.tobi.producer.controller;


import com.sh.tobi.producer.service.RabbitMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {

    @Autowired
    private RabbitMqService rabbitMqService;

    @GetMapping("rabbit")
    public void rabbit(String msg){
        rabbitMqService.sendMessage(msg);
    }
}
