package com.example.spring.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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

	@OneToOne(mappedBy = "direccion")
	private Direccion direccion;
	
	@OneToMany(mappedBy = "telefones")
	private List<Telefono> telefones;
	

	public void setTeleLista(List<Telefono> teleLista) {
		this.telefones = teleLista;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	/**
	 * Variable que es la PK, se autoincrementa y no puede ser null
	 * 
	 * @return el id de la persona
	 */
	@Id
	@GeneratedValue
	@Column(name = "idpersona")
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
	@Column(name = "nombre")
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
	@Column(name = "apellido1")
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
	@Column(name = "apellido2")
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
	@Column(name = "dni")
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
	@Column(name = "fechanacimiento")
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

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Telefono> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefono> telefones) {
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", telefones=" + telefones + "]";
	}

	

}
