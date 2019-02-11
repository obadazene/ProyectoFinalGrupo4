package com.example.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring.control.Control;
import com.example.spring.model.Persona;
import com.example.spring.servicios.IServicios;

import junit.framework.ComparisonFailure;

@RunWith(SpringRunner.class)
@SpringBootTest()
//@WebMvcTest(Control.class)
public class CoetusIvApplicationTests {

		@Autowired
		private IServicios serve;
	
		int cuentaInicial;
		int cuentaFinal;
		
	    @Test
	    public void contextLoads()  {

	    	Persona persona = new Persona();
	    	persona.setNombre("Obada");
	    	persona.setApellido1("Antonio");
	    	persona.setApellido2("Manuel");
	    	persona.setDni("159753852L");
	    	
	    	serve.addPersona(persona);
	    	
	    	cuentaInicial = serve.list().size();
	    	
	    	serve.delPersona(persona);
	    
	    	cuentaFinal = serve.list().size();
	    	
	    	assertEquals(cuentaInicial-1,cuentaFinal);
	
	    	try{
				assertEquals(cuentaInicial, cuentaFinal+1);
				assertEquals(serve.exists(persona),false);
				System.out.println("--- TEST CORRECTO ---");
			}catch (ComparisonFailure failure){
				System.out.println("--- TEST FALLIDO ---");
				System.out.println("Error: " + failure.getMessage());
				System.out.println("El tes ha fallado al eliminar la persona.");
			}catch (Exception e){
				System.out.println("--- TEST FALLIDO ---");
				System.out.println("Error: " + e.getMessage());
			}

	    }
}

