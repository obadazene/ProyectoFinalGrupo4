package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Persona;

public interface IRepositorioCustom {

	// Metodo que lista personas

	public List<Persona> getPersona();
	
	public Persona findPersona(int id);

}
