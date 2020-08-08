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
    private String idSexo;

    @Column(name = "n_sexo")
    private String nSexo;

}

