package org.example.kafka.service;


import io.smallrye.mutiny.Uni;
import io.smallrye.reactive.messaging.MutinyEmitter;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.example.kafka.domain.Data;

@ApplicationScoped
public class KafkaReactiveService {

    @Inject
    @Channel("qui-eve")
    MutinyEmitter<Data> kafkaEmitter;

    public Uni<Void> enviarMensajeAKafka(Data data) {
        return kafkaEmitter.send(data);
    }



}
