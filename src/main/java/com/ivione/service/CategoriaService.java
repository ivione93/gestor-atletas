package com.ivione.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.ivione.entity.Categoria;
import com.ivione.repository.CategoriaRepository;
@RequestScoped
public class CategoriaService {
	
	private static final Logger log =  Logger.getLogger(CategoriaService.class);
	
	@Inject
	CategoriaRepository categoriaRepository;
	
	public List<Categoria> getCategorias() {
        log.infof("Call service getCategorias method");

        List<Categoria> listCategorias = categoriaRepository.findCategorias();

        return listCategorias;
    }

}
