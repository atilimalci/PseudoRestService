package com.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("rest")
public class PseudoService {

   @POST
   @Path("api")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Response api(Request request) {
      System.err.println(request);
      Response response = new Response(200, "Success");
      return response;
   }
}
