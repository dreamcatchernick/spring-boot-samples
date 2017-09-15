package com.nick.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 15/09/2017.
 */

@Component
@RabbitListener(queues = "directQueue")
public class DirectConsumer {

    @RabbitHandler
    public void consume(String context) {
        System.out.println("Direct Exchange Consumer  : " + context);
    }
}
