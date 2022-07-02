package com.amrit.springboot.service;

import com.amrit.springboot.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);


    /**
     *
     * @param user
     * Spring kafka provided JsonDeserializer will convert JSON object into Java User object
     */
    @KafkaListener(topics = "amrit_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json msg received: %s", user.toString()));
    }
}
