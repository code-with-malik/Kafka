package com.codewithmalik.KafkaProducer.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 */

@RestController
public class PublishMessage {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value(value = "${spring.kafka.topic}")
    private String topic;

    @GetMapping("/publish/KafkaMessage/{message}")
    public ResponseEntity<String> publishMessage(@PathVariable String message) {
        System.out.println("Publishing " + message + " to topic " + topic);
        kafkaTemplate.send(topic, message);
        return new ResponseEntity<>("Message published", HttpStatus.OK);
    }
}
