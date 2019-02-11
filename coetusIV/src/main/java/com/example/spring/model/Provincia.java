package com.example.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Grupo4
 *
 */
@Entity
//@Table(name = "provincia")
public class Provincia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="idprovincia")
	private int idprovincia;
	
	private String provincia;
	
	@OneToMany(mappedBy = "provincia")
	private List<Direccion> direcciones;

	
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
