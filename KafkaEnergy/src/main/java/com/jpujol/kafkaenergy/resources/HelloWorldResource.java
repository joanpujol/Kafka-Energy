package com.jpujol.kafkaenergy.resources;

import com.jpujol.kafkaenergy.MyDAO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldResource {

    private final MyDAO myDao;

    public HelloWorldResource(MyDAO myDao) {
        this.myDao = myDao;
    }

    @POST
    public Response add(@NotNull @Valid String deviceEvent) {
        this.myDao.insert(123, deviceEvent);
        return Response.accepted().build();
    }
}
