package com.ivione.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especialidad")
public class Especialidad {
	
	@Id
    @Column(name = "id_especialidad")
    private Long idEspecialidad;

    @Column(name = "n_especialidad")
    private String nEspecialidad;

	public Long getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Long idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getnEspecialidad() {
		return nEspecialidad;
	}

	public void setnEspecialidad(String nEspecialidad) {
		this.nEspecialidad = nEspecialidad;
	}

}
