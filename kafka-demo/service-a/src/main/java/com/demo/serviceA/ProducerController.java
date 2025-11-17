package com.demo.servicea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producer")
public class ProducerController {
 @Autowired private KafkaProducer producer;
 @PostMapping public String send(@RequestBody String msg){ producer.sendMessage(msg); return "sent"; }
}