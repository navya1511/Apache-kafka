package com.deliveryboy.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryboy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class KafkaController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for(int i=0;i<200000;i++){
            kafkaService.updateLocation("(" + Math.random() *100  + " , " + Math.random() *100 + ")");
        }
        return new ResponseEntity<>((Map.of("message", "location updated")),HttpStatus.OK);
    }
}
