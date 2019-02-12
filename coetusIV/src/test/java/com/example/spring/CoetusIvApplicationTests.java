package com.example.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring.model.Persona;
import com.example.spring.servicios.IServicios;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoetusIvApplicationTests {

	@Autowired
	private IServicios serve;
	
	@Test
	public void pruebaUnitariaDelPersona() {
		
		Persona persona = new Persona();
    	persona.setNombre("Obada");
    	persona.setApellido1("Antonio");
    	persona.setApellido2("Manuel");
    	persona.setDni("159753852L");
    	
    	serve.addPersona(persona);
    	
    	int cuentaInicial = serve.list().size();
    	
    	serve.delPersona(persona);
    
    	int cuentaFinal = serve.list().size();
    	
    	assertEquals(cuentaInicial-1,cuentaFinal);
		
	}
	
	@Test
	public void pruebaUnitariaAddPersona() {
		
		Persona persona = new Persona();
    	persona.setNombre("Obada");
    	persona.setApellido1("Antonio");
    	persona.setApellido2("Manuel");
    	persona.setDni("159753852L");
    	
    	int cantidadInicial = serve.list().size();
    	
    	serve.addPersona(persona);
    	
    	int cantidadFinal = serve.list().size();
    	
    	assertEquals(cantidadInicial+1, cantidadFinal);
		
	}

}

