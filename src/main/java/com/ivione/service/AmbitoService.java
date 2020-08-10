package com.ivione.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.ivione.entity.Ambito;
import com.ivione.repository.AmbitoRepository;

@RequestScoped
public class AmbitoService {
	
private static final Logger log =  Logger.getLogger(AmbitoService.class);
	
	@Inject
	AmbitoRepository ambitoRepository;
	
	public List<Ambito> getAmbitos() {
        log.infof("Call service getAmbitos method");

        List<Ambito> listAmbitos = ambitoRepository.findAmbitos();

        return listAmbitos;
    }

}
