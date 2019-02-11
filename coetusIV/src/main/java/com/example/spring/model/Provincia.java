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

	@OneToMany(mappedBy = "direccion")
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

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public String toString() {
		return "Provincia [idprovincia=" + idprovincia + ", provincia=" + provincia + ", direcciones=" + direcciones
				+ "]";
	}

	
}
