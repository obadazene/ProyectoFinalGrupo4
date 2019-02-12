package com.example.spring.servicios;

import java.util.List;
import com.example.spring.model.Persona;

/**
 * 
 * @author Grupo4
 *
 */
public interface IServicios {

	public List<Persona> list();

	public Persona findPersona(int id);

	public static void addPersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	public void delPersona(Persona persona);
	
	public static void delPersona(int id) {
		// TODO Auto-generated method stub
		
	}

	public void salvarPersona(Persona persona);
	
	public boolean exists(Persona persona);

}
