package com.ivione.repository;

import java.util.List;

import javax.inject.Singleton;

import com.ivione.entity.Categoria;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@Singleton
public class CategoriaRepository implements PanacheRepositoryBase<Categoria, Long> {
	
	public List<Categoria> findCategorias() {
  		return findAll().list();
  	}
	
}
