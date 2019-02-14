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
public class PruebaUnitariaFindPersona {

	@Autowired
	private IServicios serve;

	private static final Logger logger = LoggerFactory.getLogger(PruebaUnitariaFindPersona.class);

	/**
	 * Se crea una persona, se añade a la BBDD, se comprueba que existe en dicha
	 * BBDD. Creamos otra persona auxiliar y volcamos en ella a la persona
	 * encontrada por el id de la persona añadida en la BBDD. Prueba que ambos id
	 * son iguales. Finalmente se elimina la persona.
	 * 
	 * @throws Exception
	 */
	@Test
	public void pruebaUnitariaFindPersona() throws Exception {

		// Creo una nueva persona
		Persona persona = new Persona();
		persona.setNombre("Juan");
		persona.setApellido1("Ferlosio");
		persona.setApellido2("López");
		persona.setDni("159753852L");

		// Añado a la bbdd la persona creada
		serve.addPersona(persona);

		// Compruebo si existe la persona y guardo su id en la variable id
		int id = serve.existsAndGetId(persona);
		persona.setIdpersona(id);

		// Si la persona existe
		if (id != 1) {
			// Busco la persona en la bbdd por ese id y la guardo en otro objeto persona
			Persona p = new Persona();
			p = serve.findPersona(id);

			// Compruebo que la persona encontrada por ese id es mi persona creada
			try {
				assertEquals(persona.getIdpersona(), p.getIdpersona());
				logger.info("La búsqueda se ha realizado correctamente");
				// Elimino la persona
				serve.delPersona(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			assertEquals(true, false);
			logger.info("Ha ocurrido un error en la búsqueda. \nLa persona no existe en la bbdd.");
		}

	}

}
