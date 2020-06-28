package com.cibertec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria {

	@Id
	@GeneratedValue
	@Column(name = "cat_id")
	private int id;

	@Column(name = "cat_nombre")
	private String nomcat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomcat() {
		return nomcat;
	}

	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}
	
	
	
	
	
}
