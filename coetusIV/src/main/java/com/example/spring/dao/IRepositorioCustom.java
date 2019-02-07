package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Contacto;

public interface IRepositorioCustom {

	//Método abstracto para añadir contacto

	public List<Contacto> addContacto();

	public List<Persona> addContacto(Persona contacto);

	
	//Método para eliminar contacto
	public void delContacto(int id);
}
