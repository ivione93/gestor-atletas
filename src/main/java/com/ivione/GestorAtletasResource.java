package com.ivione;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import com.ivione.entity.Sexo;
import com.ivione.service.SexoService;

@RequestScoped
@Path("/gestorAtletas")
public class GestorAtletasResource {
	
	private static final Logger log =  Logger.getLogger(GestorAtletasResource.class);
	
	@Inject
    SexoService sexoService;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sexos")
    public Response getSexos() throws WebApplicationException {
        log.infof("Call to getSexos method without parameters");
        
        List<Sexo> sexos = sexoService.getSexos();

        return Response.ok(sexos).build();
    }

}