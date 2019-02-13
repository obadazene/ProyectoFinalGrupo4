package com.example.spring;

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
public class PruebaUnitariaAddPersona {

	@Autowired
	private IServicios serve;

	@Test
	public void pruebaUnitariaAddPersona() throws Exception {

		Persona persona = new Persona();
		persona.setNombre("Obada");
		persona.setApellido1("Antonio");
		persona.setApellido2("Manuel");
		persona.setDni("159753852L");

		int cantidadInicial = serve.list().size();

		serve.addPersona(persona);

		int cantidadFinal = serve.list().size();

		serve.delPersona(persona);

		try {
			assertEquals(cantidadInicial + 1, cantidadFinal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}