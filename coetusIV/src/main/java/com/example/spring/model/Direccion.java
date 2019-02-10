package com.example.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Grupo4
 *
 */
@Entity
@Table(name = "direccion")
public class Direccion {
	private int iddireccion;
	private String direccion;
	private String codpostal;
	private String localidad;
	private int idprovincia;
	private int idpersona;

	// objeto Persona
	@OneToOne
	@JoinColumn(name = "idPersona")
	private Persona persona;

	@ManyToOne
	@JoinColumn(name = "idProvincia")
	private Provincia provincia;

	@Id
	@GeneratedValue
	// @Column Obada me ha dicho que lo quite, pero lo comento
	public int getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(int iddireccion) {
		this.iddireccion = iddireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [iddireccion=");
		builder.append(iddireccion);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", codpostal=");
		builder.append(codpostal);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", idprovincia=");
		builder.append(idprovincia);
		builder.append(", idpersona=");
		builder.append(idpersona);
		builder.append(", persona=");
		builder.append(persona);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append("]");
		return builder.toString();
	}

}
