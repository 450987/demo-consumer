package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics = "demo")
    public void listenGroupFoo(String message) {
        System.out.println(message);
    }
}
