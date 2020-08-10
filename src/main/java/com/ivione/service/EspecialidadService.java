package com.ivione.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.ivione.entity.Especialidad;
import com.ivione.repository.EspecialidadRepository;
@RequestScoped
public class EspecialidadService {
	
	private static final Logger log =  Logger.getLogger(EspecialidadService.class);
	
	@Inject
	EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> getEspecialidades() {
        log.infof("Call service getCategorias method");

        List<Especialidad> listEspecialidades = especialidadRepository.findEspecialidades();

        return listEspecialidades;
    }

}
