package ru.youdzhin.kafka_producer;


import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import ru.youdzhin.DTO.KafkaDTOExample;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {

    private final KafkaTemplate<String, KafkaDTOExample> kafkaTemplate;

    public void sendMessage (KafkaDTOExample msg) {
        Message<KafkaDTOExample> message = MessageBuilder
                .withPayload(msg)
                .setHeader(KafkaHeaders.TOPIC, "kafka-topic")
                .build();
        kafkaTemplate.send(message);
    }

}
