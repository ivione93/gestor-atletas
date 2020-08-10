package com.ivione.repository;

import java.util.List;

import javax.inject.Singleton;

import com.ivione.entity.Competicion;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@Singleton
public class CompeticionRepository implements PanacheRepositoryBase<Competicion, Long> {
	
	public List<Competicion> findCompeticiones() {
  		return findAll().list();
  	}
	
	public Competicion findCompeticionById(Long idCompeticion) {
  		return find("id_competicion = ?1", idCompeticion).firstResult();
  	}
	
}
