package com.amrit.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic amritTopic() {
        return TopicBuilder.name("amrit").build();
    }

    @Bean
    public NewTopic amritJsonTopic() {
        return TopicBuilder.name("amrit_json").build();
    }
}
