package org.example.kafka.resource;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.kafka.domain.Data;
import org.example.kafka.service.KafkaReactiveService;

@Path("reactive")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DataReactiveController {


    @Inject
    KafkaReactiveService kafkaReactiveService;


    @POST
    public Uni<String> add(Data data){

         return kafkaReactiveService.enviarMensajeAKafka(data)
                .map(x -> "ok")
                .onFailure().recoverWithItem("ko");
    }
}
