package com.demo.serviceB;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
 @KafkaListener(topics="demo-topic", groupId="service-b")
 public void listen(String msg){ System.out.println("Received: "+msg); }
}
