package com.demo.serviceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producer")
public class ProducerController {
 @Autowired private com.demo.serviceA.KafkaProducer producer;
 @PostMapping public String send(@RequestBody String msg){ producer.sendMessage(msg); return "sent"; }
}
