package com.example.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 
 * @author Grupo4
 *
 */
@Entity
@Table(name = "direccion")
public class Direccion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddireccion;

	private String direccion;
	private String codpostal;
	private String localidad;

	// objeto Persona
	@ManyToOne
	@JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
	private Persona personaDir;

	@ManyToOne
	@JoinColumn(name = "idprovincia", referencedColumnName = "idprovincia")
	private Provincia provincia;

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

	public Persona getPersona() {
		return personaDir;
	}

	public void setPersona(Persona personaDir) {
		this.personaDir = personaDir;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Direccion [iddireccion=" + iddireccion + ", direccion=" + direccion + ", codpostal=" + codpostal
				+ ", localidad=" + localidad 
				+ ", persona=" + personaDir + ", provincia=" + provincia + "]";
	}

}
