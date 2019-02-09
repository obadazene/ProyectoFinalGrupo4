package com.example.spring.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.example.spring.model.Persona;

public class Repositorio implements IRepositorioCustom {

	@PersistenceContext
	EntityManager em;

	// crear un lista de personas
	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> getPersona() {

		Query query = em.createNativeQuery("SELECT p.* FROM persona as p" + Repositorio.class);
		return query.getResultList();

	}

}
