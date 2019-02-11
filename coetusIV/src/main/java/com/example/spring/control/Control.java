package com.example.spring.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.spring.model.Persona;
import com.example.spring.servicios.IServicios;

/**
 * 
 * @author Grupo4
 *
 */
@Controller
public class Control {

	@Autowired
	private IServicios Iservicios;
	private static final Logger logger = LoggerFactory.getLogger(Control.class);

	/*
	 * @GetMapping("/") public ModelAndView listarPersona() throws Exception {
	 * System.out.println("--------dentro listarContactos");
	 * logger.info("-- Listado Contactos"); List<Persona> listaContactos =
	 * servicios.list();
	 * 
	 * //logger.info("--"+listaContactos.toString());
	 * 
	 * 
	 * //System.out.println(listaContactos.toString());
	 * 
	 * 
	 * ModelAndView model = new ModelAndView("ListadoContactos");
	 * model.addObject("ListadoContactos", servicios.list); return model; }
	 */

	@RequestMapping("/tt")
	public String listaPersonas(ModelMap model) throws Exception {
		logger.info("-- en Listado");
		model.addAttribute("contactList", Iservicios.list());
		return "contactList";
	}

	/*@GetMapping("/addPersona") // Incluido el botón altaContacto dentro del paréntesis
	public String addPersona(Model model) {
		logger.info("-- en Add");

		// ModelAndView model = new ModelAndView("AltaEmpleado");
		// model.addObject("contacto", add Contacto());
		// return model;

		model.addAttribute("persona", new Persona());
		return "addContacto";

	}

	@GetMapping("/editPersona")
	public String editPersona(ModelMap model, @RequestParam("id") int id) {
		logger.info("-- en EDIT");
		model.addAttribute("persona", Iservicios.findPersona(id));
		return "addContacto";
	}

	@GetMapping("/delPersona")
	public ModelAndView delPersona(@RequestParam("id") int id) {
		logger.info("-- en DELETE");
		Iservicios.delPersona(id);
		return new ModelAndView("redirect:/");
	}

	@PostMapping("/salvarPersona")
	public ModelAndView salvarPersona(@ModelAttribute Persona persona) {
		logger.info("-- en SAVE");
		Iservicios.addPersona(persona);
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/busca")
	public String findPersona(ModelMap model, @RequestParam("id") int id) {
		logger.info("-- en busacar");
		model.addAttribute("persona", Iservicios.findPersona(id));
		return "ContactList";

	}*/

}
