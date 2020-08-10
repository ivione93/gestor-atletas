package com.ivione.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.ivione.entity.Sector;
import com.ivione.repository.SectorRepository;

@RequestScoped
public class SectorService {
	
	private static final Logger log =  Logger.getLogger(SectorService.class);
	
	@Inject
	SectorRepository sectorRepository;
	
	public List<Sector> getSectores() {
        log.infof("Call service getSectores method");

        List<Sector> listSectores = sectorRepository.findSectores();

        return listSectores;
    }

}
