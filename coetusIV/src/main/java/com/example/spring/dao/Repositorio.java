package com.example.spring.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import com.example.spring.model.Contacto;

public class Repositorio implements IRepositorioCustom {
	
    @PersistenceContext
	EntityManager em;
	
	@Override
	public List<Contacto> addContacto(Contacto contacto) {
		
		
		
		
		
		
		return null;
	}

	@Override
	public void delContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		
	}

	

	
		
	

}
