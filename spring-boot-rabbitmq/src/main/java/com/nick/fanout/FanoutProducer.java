package com.nick.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 15/09/2017.
 */
@Component
public class FanoutProducer {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "This is fanout exchange message";
        rabbitTemplate.convertAndSend("testFanoutExchange","", context);
    }
}
