package com.example.spring.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import com.example.spring.model.Contacto;

public class Repositorio implements IRepositorioCustom {
	
    @PersistenceContext
	EntityManager em;
	
	@Override
	public List<Contacto> addContacto() {
		
		Query query = em.createNativeQuery("SELECT em.* FROM spring_data_jpa_example.username as em " +
           Repositorio.class);
        query.setParameter(1, username + "%");
        return query.getResultList();
		
		
		
		
		
	}

	@Override
	public void delContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		
	}

	

	
		
	

}
