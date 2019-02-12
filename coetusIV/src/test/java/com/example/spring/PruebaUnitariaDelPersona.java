package com.example.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring.model.Persona;
import com.example.spring.servicios.IServicios;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaUnitariaDelPersona {

	@Autowired
	private IServicios serve;
	
	@Test
	public void pruebaUnitariaDelPersona() throws Exception {
		
		Persona persona = new Persona();
    	persona.setNombre("Obada");
    	persona.setApellido1("Antonio");
    	persona.setApellido2("Manuel");
    	persona.setDni("159753852L");
    	
    	serve.addPersona(persona);
    	
    	int cuentaInicial = serve.list().size();

    	System.out.println(serve.exists(persona));
    	
    	serve.delPersona(persona);
    	
    	System.out.println(serve.list().toString());
    
    	int cuentaFinal = serve.list().size();
		
		try {
   	
	    	assertEquals(cuentaInicial-1,cuentaFinal);
	    	System.out.println("Ha funcionado");
	    	
	      } catch(EmptyResultDataAccessException dataAccessException) {
	    	  System.out.println("No ha funcionado");
	      }
		
		
		
	}

}

