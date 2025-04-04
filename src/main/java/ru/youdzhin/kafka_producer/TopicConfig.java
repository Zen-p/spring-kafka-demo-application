package ru.youdzhin.kafka_producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {


    @Bean
    public NewTopic KafkaExampleTopic () {
        return TopicBuilder
                .name("kafka-topic")
                .build();
    }

}
