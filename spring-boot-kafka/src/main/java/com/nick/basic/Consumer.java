package com.nick.basic;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 19/09/2017.
 */
@Component
public class Consumer {

    @KafkaListener(topics = "${kafka.topic.testtopic}")
    public void receive(String payload) {
        System.out.println(payload);
    }
}
