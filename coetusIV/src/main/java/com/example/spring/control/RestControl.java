package com.example.spring.control;
/**
 * @author Grupo4
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.spring.servicios.IServicios;

@RestController
@RequestMapping(//requerimos del apoyo de obada)
public class RestControl {

	@Autowired
	private final IServicios serve;

	public RestControl(IServicios serve) {
		this.serve = serve;
	}
	
	
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class PersonaNotFoundException extends RuntimeException {

		public PersonaNotFoundException() {
			super("Persona does not exist");
		}
	}
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class DireccionNotFoundException extends RuntimeException {

		public DireccionNotFoundException() {
			super("Direccion does not exist");
		}
	}
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class ProvinciaNotFoundException extends RuntimeException {

		public ProvinciaNotFoundException() {
			super("Provincia does not exist");
		}
	}
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class TelefonoNotFoundException extends RuntimeException {

		public TelefonoNotFoundException() {
			super("Telefono does not exist");
		}
	}
	
	
	
}
