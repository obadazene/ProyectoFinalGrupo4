package com.example.spring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona") //nombre transitorio para la tabla
public class Persona {

private int idpersona;
private String nombre;
private String apellido1;
private String apellido2;
private String dni;
private Date fechanacimiento; //también podria haber importado en vez de java.utils sql

@Id
@GeneratedValue
//@Column Obada me ha dicho que lo quite, pero lo comento
public int getIdpersona() {
	return idpersona;
}
public void setIdpersona(int idpersona) {
	this.idpersona = idpersona;
}
public String getNombre() {
	return nombre;
}
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
public Date getFechanacimiento() {
	return fechanacimiento;
}
public void setFechanacimiento(Date fechanacimiento) {
	this.fechanacimiento = fechanacimiento;
}

	
	
}
