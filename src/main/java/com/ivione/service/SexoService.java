package com.ivione.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.ivione.entity.Sexo;
import com.ivione.repository.SexoRepository;

@RequestScoped
public class SexoService {
	
	private static final Logger log =  Logger.getLogger(SexoService.class);
	
	@Inject
	SexoRepository sexoRepository;
	
	public List<Sexo> getSexos() {
        log.infof("Call service getSexos method");

        List<Sexo> listSexos = sexoRepository.findSexos();

        return listSexos;
    }

}
