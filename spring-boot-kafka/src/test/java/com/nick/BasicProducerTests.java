package com.nick;

import com.nick.basic.Basic;
import com.nick.basic.BasicProducer;
import com.nick.basic.BasicProducerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * Created by dreamcatchernick on 19/09/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicProducerTests {

    @Value("${kafka.topic.basictopic}")
    private String topic;

    @Autowired
    private BasicProducer producer;
    @Test
    public void sendRecord() {
        String messageId = UUID.randomUUID().toString();
        Basic basicMessage = new Basic(messageId, "hello nick");
        producer.send(topic ,basicMessage);
    }
}
