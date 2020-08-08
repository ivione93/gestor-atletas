package com.ivione.repository;

import java.util.List;

import javax.inject.Singleton;

import com.ivione.entity.Sexo;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@Singleton
public class SexoRepository implements PanacheRepositoryBase<Sexo, Long> {
	
	public List<Sexo> findSexos() {
  		return findAll().list();
  	}
	
}
