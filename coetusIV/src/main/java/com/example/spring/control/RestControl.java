package com.example.spring.control;
/**
 * @author Grupo4
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Persona;
import com.example.spring.servicios.IServicios;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/persona" })
public class RestControl {

	@Autowired
	private IServicios serve;

	@GetMapping
	public List<Persona> list() {
		return serve.list();
	}

	@PostMapping
	public void addPersona(@RequestBody Persona persona) {
		serve.addPersona(persona);
	}

	@GetMapping(path = { "/{id}" })
	public Persona findPersona(@PathVariable("id") int id) {
		return serve.findPersona(id);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delPersona(@PathVariable("id") int id) {
		serve.delPersona(id);
	}

}
