package com.sh.tobi.rabbitmq.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String DIRECT_EXCHANGE="directExchange";
    public static final String DIRECT_QUEUE="directQueue";
    public static final String DIRECT_ROUTINGKEY="directRoutingKey";

    /**
     * 定义一个 direct 交换机
     * @return
     */
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(DIRECT_EXCHANGE);
    }

    /**
     * 定义一个 direct 队列
     * @return
     */
    @Bean
    public Queue directQueue(){
        return new Queue(DIRECT_QUEUE);
    }

    /**
     * 定义一个队列和交换机的绑定规则根据路由key
     * @return
     */
    @Bean
    public Binding directBinding(){
        return BindingBuilder.bind(directQueue()).to(directExchange()).with(DIRECT_ROUTINGKEY);
    }
}
