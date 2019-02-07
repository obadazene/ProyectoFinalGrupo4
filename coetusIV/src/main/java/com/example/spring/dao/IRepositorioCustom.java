package com.example.spring.dao;

import java.util.List;

public interface IRepositorioCustom {

	//Método abstracto para añadir contacto
	public List<Contacto> addContacto(Contacto contacto);
	
	//Método para eliminar contacto
		public void delContacto(Contacto contacto);
}
