package com.example.spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Grupo4
 *
 */

/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
//@NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
@Table(name="persona")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idpersona;

	private String nombre;

	private String apellido1;

	private String apellido2;

	private String dni;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	/*
	 * Comentado por el profe
	// bi-directional many-to-one association to Direccion
	@JsonIgnore
	@OneToMany(mappedBy = "persona")
	private List<Direccion> direcciones;

	// bi-directional many-to-one association to Telefono
	@JsonIgnore
	@OneToMany(mappedBy = "persona")
	private List<Telefono> telefonos;
*/
	public int getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "---------Persona [idpersona=" + idpersona + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", dni=" + dni + ", fechanacimiento=" + fechanacimiento + "]";
	}
/*
	public List<Direccion> getDireccions() {
		return this.direcciones;
	}

	public void setDireccions(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	public List<Telefono> getTelefonos() {
		return this.telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
*/
	/*
	 * 
	 * public Direccion addDireccion(Direccion direccion) {
	 * getDireccions().add(direccion); direccion.setPersona(this);
	 * 
	 * return direccion; }
	 * 
	 * public Direccion removeDireccion(Direccion direccion) {
	 * getDireccions().remove(direccion); direccion.setPersona(null);
	 * 
	 * return direccion; }
	 * 
	 * 
	 * public Telefono addTelefono(Telefono telefono) {
	 * getTelefonos().add(telefono); telefono.setPersona(this);
	 * 
	 * return telefono; }
	 * 
	 * public Telefono removeTelefono(Telefono telefono) {
	 * getTelefonos().remove(telefono); telefono.setPersona(null);
	 * 
	 * return telefono; }
	 * 
	 * @Override public String toString() { return "Persona [idpersona=" + idpersona
	 * + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni +
	 * ", fechanacimiento=" + fechanacimiento + ", nombre=" + nombre +
	 * ", direcciones=" + direcciones + ", telefonos=" + telefonos + "]"; }
	 */

}
