package dhbw.vs.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Produces("text/plain")
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Hello " + msg;

		return Response.status(200).entity(output).build();
	}

}