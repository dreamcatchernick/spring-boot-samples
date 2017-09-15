package com.nick;

import com.nick.direct.DirectConsumer;
import com.nick.direct.DirectProducer;
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
public class DirectExchangeTest {
    @Autowired
    private DirectProducer directProducer;

    @Autowired
    private DirectConsumer directConsumer;

    @Test
    public void Produce() {
        directProducer.send();
    }
}
