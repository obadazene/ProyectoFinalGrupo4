package com.example.spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia {
	private int idprovincia;
	private String provincia;
	
	//Persona object
	@OneToMany(mappedBy = "provencia")
	private List<Persona> personas;
	//objeto dirreccion
	@OneToMany(mappedBy = "prvincia")
	private List<Direccion> dericciones;
	

	@Id
	@GeneratedValue
//@Column Obada me ha dicho que lo quite, pero lo comento
	public int getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
