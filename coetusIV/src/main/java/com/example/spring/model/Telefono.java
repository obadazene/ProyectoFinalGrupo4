package com.example.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase Telefono Contiene información del telefono de la persona
 * 
 * @author ManuelToledo @version1.0
 */
@Entity
public class Telefono implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtelefono")
	private int idTelefono;
	
	@ManyToOne
	@JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
	private Persona personaTel;
	
	private String telefono;

	public Telefono() {
		
	}

	public Telefono(String tel) {
		super();
		this.telefono = tel;
	}
	public Telefono(int idTelefono, String telefono) {
		super();
		this.idTelefono=idTelefono;
		this.telefono=telefono;
	}

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

	public Persona getIdpersona() {
		return personaTel;
	}

	public void setIdpersona(Persona personaTel) {
		this.personaTel = personaTel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telefono [idTelefono=");
		builder.append(idTelefono);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", idPersona=");
		builder.append(personaTel);
		builder.append("]");
		return builder.toString();
	}

}
