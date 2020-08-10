package com.ivione.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.ivione.entity.Competicion;
import com.ivione.repository.CompeticionRepository;
@RequestScoped
public class CompeticionService {
	
	private static final Logger log =  Logger.getLogger(CompeticionService.class);
	
	@Inject
	CompeticionRepository competicionRepository;
	
	public List<Competicion> getCompeticiones() {
        log.infof("Call service getCompeticiones method");

        List<Competicion> listCompeticiones = competicionRepository.findCompeticiones();

        return listCompeticiones;
    }
	
	public Competicion getCompeticionById(Long idCompeticion) {
        log.infof("Call service getCompeticion method with parameters {idCompeticion = %d}", idCompeticion);

        Competicion competicion = competicionRepository.findCompeticionById(idCompeticion);

        return competicion;
    }
	
	public void addCompeticion(Competicion competicion) {
        log.infof("Call service addCompeticion method");

        competicionRepository.persist(competicion);
    }

}
