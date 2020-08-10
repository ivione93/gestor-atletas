package com.ivione.repository;

import java.util.List;

import javax.inject.Singleton;

import com.ivione.entity.Especialidad;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@Singleton
public class EspecialidadRepository implements PanacheRepositoryBase<Especialidad, Long> {
	
	public List<Especialidad> findEspecialidades() {
  		return findAll().list();
  	}
	
}
