package com.example.spring.servicios;

import com.ejemplos.spring.model.User;
import com.example.spring.model.Persona;
/*
 * @Author Antonio Portela
 */
public interface IServicios {

	public Persona get(int id);
	
	public void add(Persona persona);
	
	public void delete(int id);
	
	
}
