package org.techiekernel.osgi.cxf.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ProduceMime;
import javax.ws.rs.core.Response;

import org.techiekernel.osgi.cxf.ProducerService;

public class ProducerServiceImpl implements ProducerService {

	@Override
	@GET
	@Path("/{param}")
	@ProduceMime("application/json")
	public Response getMsg(@PathParam("param") String msg) {
		// TODO Auto-generated method stub
		return Response.status(200).entity(msg + " has been produced.").build();
	}

}
