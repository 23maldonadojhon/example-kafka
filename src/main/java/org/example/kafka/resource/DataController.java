package org.example.kafka.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.kafka.domain.Data;
import org.example.kafka.service.KafkaService;

@Path("/data")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DataController {

    @Inject
    KafkaService kafkaService;

    @POST
    public void add(Data data){
        System.out.println(data);
        kafkaService.enviarMensajeAKafka1(data);
    }

}
