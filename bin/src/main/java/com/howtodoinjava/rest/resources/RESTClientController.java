package com.howtodoinjava.rest.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class RESTClientController
{

  public RESTClientController(){}

  @GET
  public String getEmployees()
  {
      return "{'name':'Roger Waters','name':'Tom Petty'}";
  }
}
