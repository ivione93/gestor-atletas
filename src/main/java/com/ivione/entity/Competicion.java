package com.ivione.entity;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "competicion")
public class Competicion {
	
	@Id
    @Column(name = "id_competicion")
    private Long idCompeticion;

    @Column(name = "n_competicion")
    private String nCompeticion;
    
    @Column(name = "fecha")
    private Instant fecha;
    
    @Column(name = "lugar")
    private String lugar;

	public Long getIdCompeticion() {
		return idCompeticion;
	}

	public void setIdCompeticion(Long idCompeticion) {
		this.idCompeticion = idCompeticion;
	}

	public String getnCompeticion() {
		return nCompeticion;
	}

	public void setnCompeticion(String nCompeticion) {
		this.nCompeticion = nCompeticion;
	}

	public Instant getFecha() {
		return fecha;
	}

	public void setFecha(Instant fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

}
