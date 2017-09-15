package com.nick;

import com.nick.topic.TopicProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by dreamcatchernick on 15/09/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicExchangeTest {
    @Autowired
    private TopicProducer topicProducer;

    @Test
    public void ProduceAll() {
        topicProducer.sendAll();
    }

    @Test
    public void ProduceAB() {
        topicProducer.sendAB();
    }

    @Test
    public void ProduceBC() {
        topicProducer.sendBC();
    }
}
