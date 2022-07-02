package com.amrit.springboot.controller;

import com.amrit.springboot.model.User;
import com.amrit.springboot.service.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {

        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to Kafka topic");

    }
}
