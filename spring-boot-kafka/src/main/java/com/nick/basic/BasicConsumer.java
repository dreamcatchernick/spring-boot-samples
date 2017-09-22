package com.nick.basic;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 19/09/2017.
 */
@Component
public class BasicConsumer {

    @KafkaListener(topics = "${kafka.topic.basictopic}", containerFactory = "basicKafkaListenerContainerFactory")
    public void receive(Basic basic) {

        System.out.println(basic.toString());
    }
}
