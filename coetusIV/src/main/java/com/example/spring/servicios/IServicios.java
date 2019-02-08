package com.example.spring.servicios;

import com.example.spring.model.Persona;

/*
 * @Author Antonio Portela
 */
public interface IServicios {

	public Persona get(int id);

	void delPersona(int id);

	void addPersona(Persona persona);

}
