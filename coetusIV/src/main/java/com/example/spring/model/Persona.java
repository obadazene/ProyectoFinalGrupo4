package com.example.spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase Persona Contiene informacion de cada persona
 * 
 * @author Grupo4
 * @version 1.0
 */
@Entity

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * El id de la persona, que es la PrimaryKey en la tabla
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpersona")
	private int idPersona;
	/**
	 * Nombre de la Persona
	 */
	@Column(name = "nombre")
	private String nombre;
	/**
	 * Primer apellido de la persona
	 */
	private String apellido1;
	/**
	 * Segundo apellido de la persona
	 */
	private String apellido2;
	/**
	 * DNI propiedad de la persona
	 */
	private String dni;
	/**
	 * Fecha de nacimiento de la persona
	 */
	private Date fechanacimiento; // también podria haber importado en vez de java.utils sql

	@OneToMany
	(mappedBy = "personaDir")
	private List<Direccion> direcciones;

	@OneToMany(mappedBy = "personaTel")
	private List<Telefono> telefonos;

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre setea el nombre de la persona
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechanacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechanacimiento = fechaNacimiento;
	}



	public List<Direccion> getDireccion() {
		return direcciones;
	}

	public void setDireccion(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechaNacimiento=" + fechanacimiento + ", direccion=" + direcciones
				+ ", telefonos=" + telefonos + "]";
	}

}
