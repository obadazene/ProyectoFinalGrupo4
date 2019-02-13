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

	@Test
	public void pruebaUnitariaDelPersona() throws Exception {

		Persona persona = new Persona();
		persona.setNombre("Obada");
		persona.setApellido1("Antonio");
		persona.setApellido2("Manuel");
		persona.setDni("159753852L");
		System.out.println("-1---" + persona);

		serve.addPersona(persona);

		System.out.println("-2---" + persona);
		int cuentaInicial = serve.list().size();

		// Compruebo si se ha añadido. veo si existe
		int id = serve.existsAndGetId(persona);
		if (id != -1) {
			// la personita existe
			System.out.println("*** id: " + id);
			serve.delPersona(id);
			System.out.println(persona);
			int cuentaFinal = serve.list().size();
			try {

				assertEquals(cuentaInicial - 1, cuentaFinal);

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			// La persona no existe
			// No se ha añadido
			System.out.println("No ha funcionado. No se ha añadido");
			assertEquals(true, false);

		}

	}

}
