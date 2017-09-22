package com.nick;

import com.nick.basic.BasicProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

        producer.send(topic , "hello nick");
    }
}
