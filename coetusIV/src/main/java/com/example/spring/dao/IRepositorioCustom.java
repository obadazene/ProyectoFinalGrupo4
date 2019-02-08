package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Persona;

public interface IRepositorioCustom {

	// Método abstracto para añadir contacto

	public List<Persona> addPersona();

	// Método para eliminar contacto
	public void delPersona(int id);
}
