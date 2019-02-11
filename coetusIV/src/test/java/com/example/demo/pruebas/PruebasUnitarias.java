package com.example.demo.pruebas;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.spring.control.Control;
import com.example.spring.dao.Repositorio;
import com.example.spring.servicios.IServicios;

/**
 * 
 * @author Grupo4
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(Control.class)
public class PruebasUnitarias {
	
	@Autowired
	private MockMvc mockMvc;
	
	/*
     * We use @MockBean to create and inject a mock for 
     * the IServicios (if you don’t do this the 
     * application context cannot start), and we set 
     * its expectations using Mockito.
     */
	
	@MockBean
	private IServicios Iservicios;
	
	@Test
	public void pruebaUnitariaDelPersona (){
		when(Iservicios.delPersona(id)).thenReturn("Se ha eliminado una persona");
		
		this.mockMvc
	    .perform(get("/delPersona"))
	    .andDo(print())
	    .andExpect(status().isOk())
	    .andExpect(content().string(containsString("Se ha eliminado una persona")));
	}
	
	

}
