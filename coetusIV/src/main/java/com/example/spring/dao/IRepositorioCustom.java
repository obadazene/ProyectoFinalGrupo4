package com.example.spring.dao;

import java.util.List;

public interface IRepositorioCustom {

	//Método abstracto para añadir contacto
	public List<Persona> addContacto(Persona contacto);
	
	//Método para eliminar contacto
	public void delContacto(int id);
}
