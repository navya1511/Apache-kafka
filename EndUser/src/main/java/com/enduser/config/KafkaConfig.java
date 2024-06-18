package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@Configuration
public class KafkaConfig {
    
    @KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME, groupId = AppConstants.GROUP_NAME)
    public void updateLocation(String value){
        System.out.println(value);
        
    }
}
