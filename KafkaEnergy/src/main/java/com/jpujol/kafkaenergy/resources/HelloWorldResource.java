package com.jpujol.kafkaenergy.resources;

import com.jpujol.kafkaenergy.MyDAO;
import com.jpujol.kafkaenergy.core.DeviceEvent;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private final MyDAO myDao;

    public HelloWorldResource(MyDAO myDao) {
        this.myDao = myDao;
    }

    @POST
    @Path("{id}")
    public Response add(DeviceEvent deviceEvent, @PathParam("id") final String id) {
        deviceEvent.setId(id);
        return Response.ok().build();
    }
}
