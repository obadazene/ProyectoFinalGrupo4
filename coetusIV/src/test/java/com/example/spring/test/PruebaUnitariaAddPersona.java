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
public class PruebaUnitariaAddPersona {

	@Autowired
	private IServicios serve;

	private static final Logger logger = LoggerFactory.getLogger(PruebaUnitariaAddPersona.class);

	/**
	 * Se crea una persona, la añade a la BBDD, comprueba si existe en la BBDD.
	 * Prueba que el tamaño de la lista de personas de la BBDD al final es igual al
	 * tamaño inicial + 1. Elimina esa persona de la BBDD
	 * 
	 * @throws Exception
	 */

	@Test
	public void pruebaUnitariaAddPersona() throws Exception {

		// Creo una persona
		Persona persona = new Persona();
		persona.setNombre("Héctor");
		persona.setApellido1("Gómez");
		persona.setApellido2("Perez");
		persona.setDni("159753852L");

		int cantidadInicial = serve.list().size();

		// Añado la persona a la bbdd
		serve.addPersona(persona);

		int cantidadFinal = serve.list().size();

		// Guardo su id en la variable id
		int id = serve.existsAndGetId(persona);
		// Si la persona existe
		if (id != 1) {
			try {
				assertEquals(cantidadInicial + 1, cantidadFinal);
				logger.info("La persona se ha añadido a la bbdd");

				// La elimino de la bbdd
				serve.delPersona(id);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			assertEquals(true, false);
			logger.info("La persona no existe en la bbdd");
		}

	}

}
