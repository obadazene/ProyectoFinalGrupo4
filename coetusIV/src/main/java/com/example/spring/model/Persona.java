package com.example.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Clase Persona
 * 
 * Contiene informacion de cada persona
 * @author ManuelToledo
 * @version 1.0
 */
@Entity
@Table(name = "persona") // nombre transitorio para la tabla
public class Persona {

	/**
	 * El id de la persona, que es la PrimaryKey en la tabla
	 */
	private int idPersona;
	/**
	 * Nombre de la Persona
	 */
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
	private Date fechaNacimiento; // también podria haber importado en vez de java.utils sql

	/**
	 * Variable que es la PK, se autoincrementa y no puede ser null
	 * @return el id de la persona
	 */
	@Id
	@GeneratedValue
	@Column (name = "idpersona")
	public int getIdpersona() {
		return idPersona;
	}
/**
 * @param idpersona
 */
	public void setIdpersona(int idpersona) {
		this.idPersona = idpersona;
	}
/**
 * 
 * @return nombre de la persona
 */
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
/**
 * 
 * @return devuelve el primer apellido
 */
	public String getApellido1() {
		return apellido1;
	}
/**
 * 
 * @param apellido1 setea el primer apellido
 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
/**
 * 
 * @return return el segundo apellido
 */
	public String getApellido2() {
		return apellido2;
	}
/**
 * 
 * @param apellido2 setea el segundo apellido
 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
/**
 * 
 * @return devuelve el dni
 */
	public String getDni() {
		return dni;
	}
/**
 * 
 * @param dni setea el dni
 */
	public void setDni(String dni) {
		this.dni = dni;
	}
/**
 * 
 * @return la fecha de nacimiento
 */
	public Date getFechanacimiento() {
		return fechaNacimiento;
	}
/**
 * 
 * @param fechanacimiento setea la fecha de nacimiento
 */
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechaNacimiento = fechanacimiento;
	}

}
