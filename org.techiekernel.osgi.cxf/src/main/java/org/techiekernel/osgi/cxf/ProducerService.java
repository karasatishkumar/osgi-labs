package org.techiekernel.osgi.cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/producer")
public class ProducerService{

	@GET
	@Path("/{param}")
	@Produces("application/json")
	public Response getMsg(@PathParam("param") String msg) {
		// TODO Auto-generated method stub
		return Response.status(200).entity(msg + " has been produced.").build();
	}

}
