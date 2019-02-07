package com.example.spring.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import com.example.spring.model.Contacto;

public class Repositorio implements IRepositorioCustom {
	
	private Contacto contato;
	
    @PersistenceContext
	EntityManager eman;
	
	@Override
	public List<Contacto> addContacto() {
		
		Query query = eman.createNativeQuery("SELECT c.* FROM contacto as c" +
           Repositorio.class);
        return query.getResultList();
		
		
		
		
		
	}

	@Override
	public void delContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		
	}

	

	
		
	

}
