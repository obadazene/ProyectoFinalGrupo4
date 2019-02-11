package com.example.demo.pruebas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 
 * @author Grupo4
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebasUnitarias {
		
	    @Test
	    public void contextLoads() throws Exception {
	    	//Deberia fallar aposta
	    	assertThat(false).isTrue();
	    }
	
	

}
