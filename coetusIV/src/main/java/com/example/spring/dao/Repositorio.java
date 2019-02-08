package com.example.spring.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.example.spring.model.Persona;

public class Repositorio implements IRepositorioCustom {

	@PersistenceContext
	EntityManager eman;

	// crear un lista de personas
	@Override
	public List<Persona> getPersonas() {

		Query query = eman.createNativeQuery("SELECT c.* FROM persona as c" + Repositorio.class);
		return query.getResultList();

	}

	@Override
	public List<Persona> addPersona() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delPersona(int id) {
		// TODO Auto-generated method stub

	}

}
