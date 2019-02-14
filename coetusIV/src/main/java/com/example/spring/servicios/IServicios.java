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

	public void addPersona(Persona persona);

	public void delPersona(Persona persona);

	public void delPersona(int id);

	public void salvarPersona(Persona persona);

	public boolean exists(Persona persona);

	public int existsAndGetId(Persona persona);
	

}
