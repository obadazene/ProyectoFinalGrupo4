package com.example.demo.pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring.model.Persona;
import com.example.spring.servicios.IServicios;

/**
 * 
 * @author Grupo4
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebasUnitarias {
		
		@Autowired
		private IServicios Iservicios;
	
	    @Test
	    public void contextLoads()  {
	    	//Deberia fallar aposta
	    	Persona persona = new Persona();
	    	persona.setNombre("Obada");
	    	persona.setApellido1("Antonio");
	    	persona.setApellido2("Manuel");
	    	persona.setDni("159753852L");
	    	
	    	Iservicios.addPersona(persona);
	    	
	    	int cuentaInicial = Iservicios.list().size();
	    	
	    	Iservicios.delPersona(persona);
	    
	    	int cuentaFinal = Iservicios.list().size();
	    	
	    	assertEquals(cuentaInicial-1,cuentaFinal);
	    }
	
	

}
