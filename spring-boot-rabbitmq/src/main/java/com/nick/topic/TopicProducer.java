package com.nick.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 15/09/2017.
 */
@Component
public class TopicProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendAll() {
        String context = "All queue should receive this message";
        this.rabbitTemplate.convertAndSend("testTopicExchange", "main.topic.A", context);
    }

    public void sendAB() {
        String context = "Only A and B can receive this message";
        this.rabbitTemplate.convertAndSend("testTopicExchange", "test.topic.A", context);
    }

    public void sendBC() {
        String context = "Only B and C can receive this message";
        this.rabbitTemplate.convertAndSend("testTopicExchange", "main.topic.KK", context);
    }
}
