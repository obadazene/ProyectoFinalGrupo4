package com.example.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * 
 * @author Grupo4
 *
 */

/**
 * The persistent class for the provincia database table.
 * 
 */
@Entity
@NamedQuery(name = "Provincia.findAll", query = "SELECT p FROM Provincia p")
public class Provincia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idprovincia;

	private String provincia;

	// bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy = "provincia")
	private List<Direccion> direccions;

	public Provincia() {
	}

	public int getIdprovincia() {
		return this.idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	/*
	 * comentado por ASR
	 * 
	 * public Direccion addDireccion(Direccion direccion) {
	 * getDireccions().add(direccion); direccion.setProvincia(this);
	 * 
	 * return direccion; }
	 * 
	 * public Direccion removeDireccion(Direccion direccion) {
	 * getDireccions().remove(direccion); direccion.setProvincia(null);
	 * 
	 * return direccion; }
	 * 
	 */
	/*
	 * @Override public String toString() { return "Provincia [idprovincia=" +
	 * idprovincia + ", provincia=" + provincia + ", direccions=" + direccions +
	 * "]"; }
	 */
}
