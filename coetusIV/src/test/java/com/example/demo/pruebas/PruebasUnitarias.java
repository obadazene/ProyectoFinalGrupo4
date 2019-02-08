package com.example.demo.pruebas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.example.spring.dao.Repositorio;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebasUnitarias {
	private static Logger logger;
	
	@Autowired
	private Repositorio repositorio;
	
	//La anotación @Test marca el siguiente método como una prueba JUnit. 
	@Test
	public void testDelPersona() {
		
		
	}
	 
	
}