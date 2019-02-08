package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Persona;

public interface IRepositorioCustom {

<<<<<<< HEAD
	// Método abstracto para añadir persona

	public List<Persona> addPersona();

	// Método para eliminar persona
=======
	// Método abstracto para añadir contacto

	public List<Persona> addPersona();

	// Método para eliminar contacto
>>>>>>> paula
	public void delPersona(int id);

	// Metodo que lista personas
	List<Persona> getPersonas();
}
