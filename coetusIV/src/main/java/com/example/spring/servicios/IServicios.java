package com.example.spring.servicios;

import com.example.spring.model.Persona;

/*
 * @Author Antonio Portela
 */
public interface IServicios {

	public Persona getPersona(int id);
		

	public  Persona findPersona(int id);

	public void addPersona(Persona persona);

	public void delPersona(int id);

	public void salvarPersona(Persona persona);

}
