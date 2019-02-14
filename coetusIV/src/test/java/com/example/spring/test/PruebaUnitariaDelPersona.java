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
public class PruebaUnitariaDelPersona {

	@Autowired
	private IServicios serve;

	private static final Logger logger = LoggerFactory.getLogger(PruebaUnitariaDelPersona.class);

	/**
	 * Se crea una persona, la añade a la BBDD, comprueba si existe en dicha BBDD.
	 * Elimina la persona de la BBDD. Prueba que el tamaño de la lista de persona de
	 * la BBDD después de añadir a la persona - 1 es igual al tamaño final después
	 * de eliminarla
	 * 
	 * @throws Exception
	 */
	@Test
	public void pruebaUnitariaDelPersona() throws Exception {

		// Creo una persona
		Persona persona = new Persona();
		persona.setNombre("Hugo");
		persona.setApellido1("Fernández");
		persona.setApellido2("Gil");
		persona.setDni("159753852L");

		// Añado la persona a la bbdd
		serve.addPersona(persona);

		int tamañoInicial = serve.list().size();

		// Compruebo si se ha añadido la persona a la bbdd
		int id = serve.existsAndGetId(persona);
		if (id != -1) {
			// La personita existe
			logger.info("Id: " + id);
			// Elimino la persona
			serve.delPersona(id);

			int tamañoFinal = serve.list().size();

			try {
				assertEquals(tamañoInicial - 1, tamañoFinal);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			// La persona no existe
			// No se ha añadido a la bbdd
			logger.info("La persona no existe en la base de datos");
			assertEquals(true, false);

		}

	}

}
