package dhbw.vs.jaxrs;

import org.glassfish.grizzly.http.server.HttpServer;

import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.DefaultResourceConfig;

public class Main {

	private static final String URL_TO_RUN_SERVER = "http://localhost:8888";

	public static void main(String[] args) throws Exception {
		
		// Create a web server configuration and add our sole resource to it
		DefaultResourceConfig resourceConfig = new DefaultResourceConfig(HelloWorldService.class);

		// Start the server and pass the configuration
		HttpServer server = GrizzlyServerFactory.createHttpServer(URL_TO_RUN_SERVER, resourceConfig);

		System.out.println("Running, now invoke " + URL_TO_RUN_SERVER + "/hello/REPLACE_THIS");
		
		// Wait until a key is pressed and then stop the service
		System.out.println("Press any key to stop the service...");
		System.in.read();

		server.stop();
	}
}
