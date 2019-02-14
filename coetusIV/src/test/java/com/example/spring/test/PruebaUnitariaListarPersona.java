package com.example.spring.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

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

	private static final Logger logger = LoggerFactory.getLogger(PruebaUnitariaListarPersona.class);

	@Test
	public void pruebaUnitariaListarPersona() throws Exception {// Realizo un test para demostrar que existe la lista

		try {
			
			List<Persona> lista1 = serve.list();

		} catch (Exception e) {
			assertEquals(true, false);
			logger.info("La lista no funciona o no existe");
			e.printStackTrace();
		}
	}

}
