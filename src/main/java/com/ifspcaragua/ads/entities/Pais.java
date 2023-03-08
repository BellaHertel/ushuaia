package com.ifspcaragua.ads.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="paises")
public class Pais {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private Long id;
	@Column(nullable=false, length= 50, unique=true)
	private String pais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Pais() {
		
	}

}
