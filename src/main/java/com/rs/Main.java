package com.rs;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {
	public static final String BASE_URI = "http://localhost:9090/pseudo/";

	public static void main(String[] args) throws IOException {
		final ResourceConfig rc = new ResourceConfig().packages("com.rs");
		rc.register(AuthFilter.class);
		final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(
				URI.create(BASE_URI), rc);
		System.out.println(String.format(
				"Server started with WADL available at "
						+ "%sapplication.wadl\n. Press enter to end...",
				BASE_URI));
		System.in.read();
		server.shutdownNow();
	}
}
