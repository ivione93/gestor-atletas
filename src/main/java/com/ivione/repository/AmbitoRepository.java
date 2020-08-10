package com.ivione.repository;

import java.util.List;

import javax.inject.Singleton;

import com.ivione.entity.Ambito;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@Singleton
public class AmbitoRepository implements PanacheRepositoryBase<Ambito, Long>{
	
	public List<Ambito> findAmbitos() {
  		return findAll().list();
  	}

}
