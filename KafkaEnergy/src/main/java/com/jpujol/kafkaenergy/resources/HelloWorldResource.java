package com.jpujol.kafkaenergy.resources;

import com.jpujol.kafkaenergy.MyDAO;
import com.jpujol.kafkaenergy.core.DeviceEventModel;
import com.jpujol.kafkaenergy.core.KafkaEnergyProducer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@Consumes(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private final MyDAO myDao;

    public HelloWorldResource(MyDAO myDao) {
        this.myDao = myDao;
    }

    @POST
    @Path("{id}")
    public Response add(DeviceEventModel deviceEvent, @PathParam("id") final String id) throws Exception {
        deviceEvent.setId(id);
        KafkaEnergyProducer.runProducer(deviceEvent);
        return Response.ok().build();
    }
}
