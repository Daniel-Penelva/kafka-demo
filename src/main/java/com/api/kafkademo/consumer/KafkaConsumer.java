package com.api.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.api.kafkademo.payload.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "daniel", groupId = "myGroup")
    public void consumerMsg(String msg){
        log.info(String.format("Consuming the message from daniel Topic :: %s", msg));
    }

    @KafkaListener(topics = "daniel", groupId = "myGroup")
    public void consumerJsonMsg(Student student){
        log.info(String.format("Consuming the message from daniel Topic :: %s",student.toString()));
    }
    
}
