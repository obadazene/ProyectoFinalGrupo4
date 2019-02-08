package com.example.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase Telefono Contiene información del telefono de la persona
 * 
 * @author ManuelToledo @version1.0
 */
@Entity
@Table(name = "telefono")
public class Telefono {
	private int idTelefono;
	private String telefono;
	private int idPersona;

	@Id
	@GeneratedValue
	@Column(name = "idtelefono")
	public int getIdtelefono() {
		return idTelefono;
	}

	public void setIdtelefono(int idtelefono) {
		this.idTelefono = idtelefono;
	}

	@Column(name = "telefono")
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "idpersona")
	public int getIdpersona() {
		return idPersona;
	}

	public void setIdpersona(int idpersona) {
		this.idPersona = idpersona;
	}

}
