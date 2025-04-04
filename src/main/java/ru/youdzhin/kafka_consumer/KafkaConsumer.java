package ru.youdzhin.kafka_consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.youdzhin.DTO.KafkaDTOExample;

@Service
@Slf4j
public class KafkaConsumer {


    @KafkaListener (
            topics = "kafka-topic",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume (KafkaDTOExample msg) {
        System.out.println("hui");
        log.info(msg.toString());
    }

}
