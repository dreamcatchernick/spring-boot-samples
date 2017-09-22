package com.nick.advanced;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Created by dreamcatchernick on 22/09/2017.
 */
@Component
public class AdvancedConsumer {
    @KafkaListener(topics = "${kafka.topic.advancedtopic}", containerFactory = "advancedKafkaListenerContainerFactory")
    public void receive(@Payload String payload,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println(String.format("From partition %d : %s", partition, payload) );
    }

    @KafkaListener(
            containerFactory = "advancedKafkaListenerContainerFactory",
            topicPartitions = @TopicPartition(
                    topic = "${kafka.topic.advancedtopic}",
                    partitionOffsets = @PartitionOffset(
                            partition = "0" ,
                            initialOffset = "0")))
    public void receiveFromBegin(@Payload String payload,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println(String.format("Read all message from partition %d : %s", partition, payload) );
    }

}
