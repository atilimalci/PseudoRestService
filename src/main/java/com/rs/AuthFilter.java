package com.rs;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.internal.util.Base64;

public class AuthFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequest)
     throws IOException {

        // Automatically allow certain requests.
        String method = containerRequest.getMethod();
        String path = containerRequest.getUriInfo().getPath();
        if (method.equals("GET") && path.equals("application.wadl"))
            return;

        // Get the authentication passed in HTTP headers parameters
        String auth = containerRequest.getHeaderString("Authorization");
        if (auth == null)
        	containerRequest.abortWith(Response
                    .status(Response.Status.UNAUTHORIZED)
                    .entity("This service needs authorization.")
                    .build());

        auth = auth.replaceFirst("[Bb]asic ", "");
        String userColonPass = Base64.decodeAsString(auth);

        if (!userColonPass.equals("username:password"))
        	containerRequest.abortWith(Response
                    .status(Response.Status.UNAUTHORIZED)
                    .entity("Authorization failed.")
                    .build());
    }
}
