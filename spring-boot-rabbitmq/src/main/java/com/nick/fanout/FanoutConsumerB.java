package com.nick.fanout;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 15/09/2017.
 */
@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "fanoutqueueB",durable = "true"),
                exchange = @Exchange(value = "testFanoutExchange",type = ExchangeTypes.FANOUT))
)
public class FanoutConsumerB {

    @RabbitHandler
    public void consume(String message) {
        System.out.println("Fanout Exchange Consumer B  : " + message);
    }
}