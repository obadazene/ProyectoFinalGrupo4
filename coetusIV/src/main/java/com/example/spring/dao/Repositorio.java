package com.example.spring.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import com.example.spring.model.Contacto;

public class Repositorio implements IRepositorioCustom {
	

	
    @PersistenceContext
	EntityManager eman;
	// crear un lista de contactos
	@Override
	public List<Contacto> addContacto() {
		
		Query query = eman.createNativeQuery("SELECT c.* FROM contacto as c" +
           Repositorio.class);
        return query.getResultList();
		
		
		
		
		
	}

	@Override
	public void delContacto(int id ) {
		
		
		
	}

	

	
		
	

}
