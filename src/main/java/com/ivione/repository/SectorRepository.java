package com.ivione.repository;

import java.util.List;

import javax.inject.Singleton;

import com.ivione.entity.Sector;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@Singleton
public class SectorRepository implements PanacheRepositoryBase<Sector, Long> {
	
	public List<Sector> findSectores() {
  		return findAll().list();
  	}
	
}
