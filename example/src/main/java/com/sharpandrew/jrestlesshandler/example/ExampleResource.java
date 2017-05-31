package com.sharpandrew.jrestlesshandler.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public final class ExampleResource {
  @GET
  @Path("/ping")
  @Produces(MediaType.TEXT_HTML)
  public String ping() {
    return "pong";
  }
}
