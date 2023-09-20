package org.example.kafka.service;


import io.smallrye.reactive.messaging.kafka.KafkaProducer;
import io.smallrye.reactive.messaging.kafka.KafkaRecord;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.example.kafka.domain.Data;

@ApplicationScoped
public class KafkaService {


    //@Inject
    //@Channel("qui-eve")
    //Emitter<Data> kafkaEmitter;


    public void enviarMensajeAKafka1(Data data) {
        //kafkaEmitter.send(data);
    }
}
