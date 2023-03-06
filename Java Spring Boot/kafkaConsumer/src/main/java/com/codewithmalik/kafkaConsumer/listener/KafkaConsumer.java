package com.codewithmalik.kafkaConsumer.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 */

@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka-producer-topic", groupId = "Consumer-Group-1")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
