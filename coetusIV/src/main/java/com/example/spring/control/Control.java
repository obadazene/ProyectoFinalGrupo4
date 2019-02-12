package com.example.spring.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	private IServicios iServicios;
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

	@RequestMapping("/lista")
	public String listaPersonas(ModelMap model) throws Exception {
		logger.info("------ CONTROL: en listaPersonas");
		// model.addAttribute("contactList", iServicios.list().toString());
		model.addAttribute("contactList", iServicios.list());
		logger.info("------ CONTROL: ANTES DE SALIR");
		return "contactList";
	}

	@GetMapping("/new") // Incluido el botón altaContacto dentro del paréntesis
	public String addPersona(ModelMap model) {
		logger.info("-- en Add");
		model.addAttribute("persona", new Persona());
		return "addPersona";

	}

	@GetMapping("/editPersona")
	public String editPersona(ModelMap model, @RequestParam("id") int id) {
		logger.info("-- en EDIT");
		model.addAttribute("persona", iServicios.findPersona(id));
		return "addContacto";
	}

	@GetMapping("/delPersona")
	public @ResponseBody ModelAndView delPersona(@RequestParam("id") int id) {
		logger.info("-- en DELETE");
		iServicios.delPersona(id);
		return new ModelAndView("redirect:/");
	}

	@PostMapping("/save")
	public ModelAndView salvarPersona(@ModelAttribute Persona persona) {
		logger.info("-- en SAVE");
		iServicios.salvarPersona(persona);
		return new ModelAndView("redirect:/lista");
	}

	@GetMapping("/busca")
	public String findPersona(ModelMap model, @RequestParam("id") int id) {
		logger.info("-- en busacar");
		model.addAttribute("persona", iServicios.findPersona(id));
		return "ContactList";

	}

}