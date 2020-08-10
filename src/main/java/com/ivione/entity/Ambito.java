package com.ivione.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ambito")
public class Ambito {
	
	@Id
    @Column(name = "id_ambito")
    private Long idAmbito;

    @Column(name = "n_ambito")
    private String nAmbito;

	public Long getIdAmbito() {
		return idAmbito;
	}

	public void setIdAmbito(Long idAmbito) {
		this.idAmbito = idAmbito;
	}

	public String getnAmbito() {
		return nAmbito;
	}

	public void setnAmbito(String nAmbito) {
		this.nAmbito = nAmbito;
	}
}