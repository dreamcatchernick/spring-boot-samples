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
                value = @Queue(value = "topicQueueA",durable = "true"),
                exchange = @Exchange(value = "testTopicExchange",type = ExchangeTypes.TOPIC),
                key = "*.topic.A")
)
public class TopicConsumerA {
    @RabbitHandler
    public void consume(String message) {
        System.out.println("Topic Consumer A  : " + message);
    }
}
