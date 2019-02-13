package com.example.spring.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class PruebaUnitariaListarPersona {
	
	@Autowired
	private IServicios serve;
	
	private static final Logger logger = LoggerFactory.getLogger(PruebaUnitariaAddPersona.class);
	
	@Test
	public void pruebaUnitariaListarPersona() throws Exception {//Realizo un test para demostrar que existe la lista
		
		//Creo una persona
		Persona persona = new Persona();
		persona.setNombre("Hola");
		persona.setApellido1("Soy la Prueba Test Listar");
		persona.setApellido2("Estoy viva");
		persona.setDni("159753852L");
		
        // Añado esa nueva persona a la bbdd
		int cantidadInicial = serve.list().size();
		
        
		serve.addPersona(persona);// Se realiza un add persona para determinar si la lista existe

		int cantidadFinal = serve.list().size();

		// Guardo su id en la variable id
		int id = serve.existsAndGetId(persona);
		
		// Si la persona existe
		
		if (id != 1) {
		
			try {
			assertEquals(cantidadInicial+1, cantidadFinal);
			logger.info("Se ha añadido la nueva perosna correctamente, la BBDD existe");
			
			    // Elimino la nueva persona de la bbdd
				serve.delPersona(id);
			
		} catch (Exception e) {
			e.printStackTrace();
		  }
		}else {
			// La Lista no funciona
			assertEquals(true, false);
			logger.info("La persona no existe en la bbdd, la lista no funciona o no existe");
		}
	}
       
}  



