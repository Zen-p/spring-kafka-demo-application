package ru.youdzhin.kafka_producer;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.youdzhin.DTO.KafkaDTOExample;

@RestController
@RequestMapping("/api/v1/messages")
@AllArgsConstructor
public class kafkaController {


    private final KafkaJsonProducer producer;


    @PostMapping
    public ResponseEntity<String> sendMsg (@RequestBody KafkaDTOExample message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("message is delivered to topic");
    }

}
