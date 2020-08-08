package com.ivione;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jboss.logging.Logger;

@RequestScoped
@Path("/gestorAtletas")
public class GestorAtletasResource {
	
	private static final Logger log =  Logger.getLogger(GestorAtletasResource.class);
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/atletas")
    public Response getAtletas() {
        log.infof("Call to getAtletas method without parameters");

        return Response.ok("Atletas").build();
    }
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/atletas/{id_atleta}")
    public Response getAtletas(@PathParam("id_atleta") final int atletaId) {
        log.infof("Call to getAtletas method with parameters: {id_atleta: %s}", atletaId);

        return Response.ok("Atletas por id").build();
    }

}