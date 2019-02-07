package com.example.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefono")
public class Telefono {
	private int idtelefono;
	private String telefono;
	private int idpersona;

	@Id
	@GeneratedValue
//@Column Obada me ha dicho que lo quite, pero lo comento
	public int getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(int idtelefono) {
		this.idtelefono = idtelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

}
