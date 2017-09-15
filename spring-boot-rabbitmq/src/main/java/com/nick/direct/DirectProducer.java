package com.nick.direct;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 15/09/2017.
 */
@Component
public class DirectProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "This direct exchange message";
        this.rabbitTemplate.convertAndSend("testqueue" , context );
    }
}
