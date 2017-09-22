package com.nick;

import com.nick.advanced.AdvancedProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by dreamcatchernick on 22/09/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdvancedProducerTests {
    @Value("${kafka.topic.advancedtopic}")
    private String topic;

    @Autowired
    private AdvancedProducer producer;
    @Test
    public void sendRecord() {

        producer.send(topic , "this is message from advanced producer" , 10);
    }
}
