package com.ivione;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import com.ivione.entity.Ambito;
import com.ivione.entity.Categoria;
import com.ivione.entity.Competicion;
import com.ivione.entity.Especialidad;
import com.ivione.entity.Sector;
import com.ivione.entity.Sexo;
import com.ivione.service.AmbitoService;
import com.ivione.service.CategoriaService;
import com.ivione.service.CompeticionService;
import com.ivione.service.EspecialidadService;
import com.ivione.service.SectorService;
import com.ivione.service.SexoService;

@RequestScoped
@Path("/gestorAtletas")
public class GestorAtletasResource {
	
	private static final Logger log =  Logger.getLogger(GestorAtletasResource.class);
	
	@Inject
	AmbitoService ambitoService;
	
	@Inject
	CategoriaService categoriaService;
	
	@Inject
	CompeticionService competicionService;
	
	@Inject
	EspecialidadService especialidadService;
	
	@Inject
    SectorService sectorService;
	
	@Inject
    SexoService sexoService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/ambitos")
	public Response getAmbitos() throws WebApplicationException {
		log.infof("Call to getAmbitos method without parameters");
		
		List<Ambito> ambitos = ambitoService.getAmbitos();
		
		return Response.ok(ambitos).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/categorias")
	public Response getCategorias() throws WebApplicationException {
		log.infof("Call to getCategorias method without parameters");
		
		List<Categoria> categorias = categoriaService.getCategorias();
		
		return Response.ok(categorias).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/competiciones")
	public Response getCompeticiones() throws WebApplicationException {
		log.infof("Call to getCompeticiones method without parameters");
		
		List<Competicion> competiciones = competicionService.getCompeticiones();
		
		return Response.ok(competiciones).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/competiciones/{idCompeticion}")
	public Response getCompeticionById(@PathParam("idCompeticion") Long idCompeticion) throws WebApplicationException {
		log.infof("Call to getCompeticionById method with parameters {idCompeticion = %s}", idCompeticion);
		
		Competicion competicion = competicionService.getCompeticionById(idCompeticion);
		
		return Response.ok(competicion).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/competiciones")
	public void addCompeticion(Competicion competicion) throws WebApplicationException {
		log.infof("Call to addCompeticiones");
		
		competicionService.addCompeticion(competicion);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/especialidades")
	public Response getEspecialidades() throws WebApplicationException {
		log.infof("Call to getEspecialidades method without parameters");
		
		List<Especialidad> especialidades = especialidadService.getEspecialidades();
		
		return Response.ok(especialidades).build();
	}
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sectores")
    public Response getSectores() throws WebApplicationException {
        log.infof("Call to getSectores method without parameters");
        
        List<Sector> sectores = sectorService.getSectores();

        return Response.ok(sectores).build();
    }
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sexos")
    public Response getSexos() throws WebApplicationException {
        log.infof("Call to getSexos method without parameters");
        
        List<Sexo> sexos = sexoService.getSexos();

        return Response.ok(sexos).build();
    }

}