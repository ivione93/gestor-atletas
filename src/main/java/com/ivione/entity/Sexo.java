package com.ivione.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sexo")
public class Sexo {
	
	@Id
    @Column(name = "id_sexo")
    private Long idSexo;

    @Column(name = "n_sexo")
    private String nSexo;

	public Long getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Long idSexo) {
		this.idSexo = idSexo;
	}

	public String getnSexo() {
		return nSexo;
	}

	public void setnSexo(String nSexo) {
		this.nSexo = nSexo;
	}
}

