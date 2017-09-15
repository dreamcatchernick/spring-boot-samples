package com.nick.topic;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 15/09/2017.
 */
@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "topicQueueC",durable = "true"),
                exchange = @Exchange(value = "testTopicExchange",type = ExchangeTypes.TOPIC),
                key = "main.topic.*")
)
public class TopicConsumerC {
    @RabbitHandler
    public void consume(String message) {
        System.out.println("Topic Consumer C  : " + message);
    }
}
