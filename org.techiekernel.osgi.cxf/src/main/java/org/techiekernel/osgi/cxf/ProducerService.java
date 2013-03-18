package org.techiekernel.osgi.cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ProduceMime;
import javax.ws.rs.core.Response;

@Path("/producer")
public interface ProducerService {
	@GET
	@Path("/{param}")
	@ProduceMime("application/json")
	public Response getMsg(@PathParam("param") String msg); 
}
