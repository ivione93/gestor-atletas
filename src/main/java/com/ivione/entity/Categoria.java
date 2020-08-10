package com.ivione.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
    @Column(name = "id_categoria")
    private Long idCategoria;

    @Column(name = "n_categoria")
    private String nCategoria;
    
    @Column(name = "d_categoria")
    private String dCategoria;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getnCategoria() {
		return nCategoria;
	}

	public void setnCategoria(String nCategoria) {
		this.nCategoria = nCategoria;
	}

	public String getdCategoria() {
		return dCategoria;
	}

	public void setdCategoria(String dCategoria) {
		this.dCategoria = dCategoria;
	}

}
