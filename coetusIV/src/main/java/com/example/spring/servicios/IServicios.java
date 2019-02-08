package com.example.spring.servicios;

import com.example.spring.model.Persona;

/*
 * @Author Antonio Portela
 */
public interface IServicios {

	public Persona getPersona(int id);
	
	public void updatePersona(Persona persona);//Es el equivalente a Update en el ejercicio 11
	
	public void addPersona(Persona persona);
	
	public void delPersona(int id);

	void salvarPersona(Persona persona);
	

}
