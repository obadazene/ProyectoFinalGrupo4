package com.example.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefono")
public class Telefono {
	private int idTelefono;
	private String telefono;
	private int idPersona;

	@Id
	@GeneratedValue
//@Column Obada me ha dicho que lo quite, pero lo comento
	public int getIdtelefono() {
		return idTelefono;
	}

	public void setIdtelefono(int idtelefono) {
		this.idTelefono = idtelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdpersona() {
		return idPersona;
	}

	public void setIdpersona(int idpersona) {
		this.idPersona = idpersona;
	}

}
