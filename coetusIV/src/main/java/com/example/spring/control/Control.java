package com.example.spring.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	/**
	 * Declaramos tanto un Logger como una interfaz de servicios
	 */
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
	/**
	 * Devuelve la lista de personas cuando utilizamos el alias "/lista"
	 * 
	 * @param model
	 * @return el jsp de la lista de contactos
	 * @throws Exception
	 */
	@RequestMapping("/lista")
	public String listaPersonas(ModelMap model) throws Exception {
		logger.info("------ CONTROL: en listaPersonas");
		// model.addAttribute("contactList", iServicios.list().toString());
		model.addAttribute("contactList", iServicios.list());
		logger.info("------ CONTROL: ANTES DE SALIR");
		return "contactList";
	}

	/**
	 * Creamos una persona que es añadida a la BBDD
	 * 
	 * @param model
	 * @return el jsp de la persona añadida al llamar al alias "/new"
	 */
	@GetMapping("/new") // Incluido el botón altaContacto dentro del paréntesis
	public String addPersona(ModelMap model) {
		logger.info("-- en Add");
		model.addAttribute("persona", new Persona());
		logger.info("----saliendo de add");
		return "addPersona";

	}

	/**
	 * Busca una persona por su Id para editarla
	 * 
	 * @param model
	 * @param id
	 * @return jsp de la persona encontrada al llamar al alias "/editPersona"
	 */
	@GetMapping("/editPersona")
	public String editPersona(ModelMap model, @RequestParam("id") int id) {
		logger.info("-- en EDIT");
		model.addAttribute("persona", iServicios.findPersona(id));
		return "addPersona";
	}

	/**
	 * Con el id de la persona, la elimina
	 * 
	 * @param id
	 * @return el jsp de la lista actualizada
	 */
	@GetMapping("/delPersona")
	public @ResponseBody ModelAndView delPersona(@RequestParam("id") int id) {
		logger.info("-- en DELETE");
		iServicios.delPersona(id);
		return new ModelAndView("redirect:/lista");
	}

	/**
	 * Guarda una persona
	 * 
	 * @param persona
	 * @return jsp de la lista actualizada, ahora con la persona guardada cuando lo
	 *         redirige al alias "/lista"
	 */
	@PostMapping("/save")
	public ModelAndView salvarPersona(@ModelAttribute Persona persona) {
		logger.info("-- Control. en SAVE. Entrando");
		logger.info("----" + persona.toString());
		iServicios.salvarPersona(persona);
		logger.info("-- en SAVE. âso medio");
		return new ModelAndView("redirect:/lista");

	}

	/*
	 * Busca una persona por id
	 * 
	 * @param model
	 * 
	 * @param id
	 * 
	 * @return el jsp con la persona buscada
	 *
	 * /*@GetMapping("/busca") public String findPersona(ModelMap
	 * model, @RequestParam("id") int id) { logger.info("-- en buscar");
	 * model.addAttribute("persona", iServicios.findPersona(id)); return
	 * "ContactList";
	 * 
	 * }
	 */

	/**
	 * Devuelve los detalles de una persona
	 * 
	 * @param model
	 * @param id
	 * @return el jsp con los detalles de la persona buscada por id
	 */

	@GetMapping("/detailPersona")
	public String detailPersona(ModelMap model, @RequestParam("id") int id) {
		logger.info("------ CONTROL: en detailPersona");
		model.addAttribute("persona", iServicios.findPersona(id));
		logger.info("------ CONTROL: ANTES DE SALIR de detail");
		return "detailPersona";
	}

}