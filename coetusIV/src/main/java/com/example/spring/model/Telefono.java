package com.example.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase Telefono Contiene información del telefono de la persona
 * 
 * @author ManuelToledo 
 * @version1.0
 */
@Entity
@Table(name = "telefono")
public class Telefono {

	@Id
	@GeneratedValue
	@Column(name = "idtelefono")
	private int idTelefono;
	@Column(name = "telefono")
	private String telefono;
	@ManyToOne
	@JoinColumn(name = "idpersona")
	private int idPersona;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telefono [idTelefono=");
		builder.append(idTelefono);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", idPersona=");
		builder.append(idPersona);
		builder.append("]");
		return builder.toString();
	}

}
