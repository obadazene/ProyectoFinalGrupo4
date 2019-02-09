package com.example.spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Grupo4
 *
 */
@Entity
@Table(name = "provincia")
public class Provincia {
	private int idprovincia;
	private String provincia;

	// objeto persona
	@OneToMany(mappedBy = "provincia")
	private List<Persona> personas;
	
	// objeto direccion
	@OneToMany(mappedBy = "provincia")
	private List<Direccion> direcciones;

	@Id
	@GeneratedValue
	// @Column Obada me ha dicho que lo quite, pero lo comento
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincia [idprovincia=");
		builder.append(idprovincia);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", personas=");
		builder.append(personas);
		builder.append(", direcciones=");
		builder.append(direcciones);
		builder.append("]");
		return builder.toString();
	}

}
