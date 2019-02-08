package com.example.spring.servicios;

import com.example.spring.model.Persona;

/*
 * @Author Antonio Portela
 */
public interface IServicios {

	public Persona get(int id);
	
	public void save(Persona persona);//Es el equivalente a Update en el ejercicio 11
	
	public void add(Persona persona);
	
	public void delete(int id);
	

	Persona findPersona(int id);

}
