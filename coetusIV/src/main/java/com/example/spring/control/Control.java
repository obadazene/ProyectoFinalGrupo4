package com.example.spring.control;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.spring.model.Persona;
import com.example.spring.servicios.Servicios;


@Controller
public class Control {
	
	@Autowired
	private Servicios servicios;
	private static final Logger logger = LoggerFactory.getLogger(Control.class);
	
	
	/*@GetMapping("/")
	public ModelAndView  listarPersona() throws Exception {
		System.out.println("--------dentro listarContactos");
		logger.info("-- Listado Contactos");
		List<Persona> listaContactos = servicios.list();
		
		//logger.info("--"+listaContactos.toString());
		
		
		//System.out.println(listaContactos.toString());
		
		
		ModelAndView model = new ModelAndView("ListadoContactos");
		model.addObject("ListadoContactos", servicios.list);
		return model;
	}	*/
	
	
	@GetMapping( "/addPersona")// Incluido el botón altaContacto dentro del paréntesis 
	public String addPersona(Model model) {
		logger.info("-- en Add");
		
		//ModelAndView model = new ModelAndView("AltaEmpleado");
		//model.addObject("contacto", add Contacto());
		//return model;
	
		model.addAttribute("persona", new Persona());
		return "UserForm";
	
	}
	
	//@DeleteMapping("/")
	@GetMapping("/delete")
	public ModelAndView delPersona(@RequestParam("id") int id) {
		logger.info("-- en DELETE");
		servicios.delPersona(id);
		return new ModelAndView("redirect:/");		
	}
	
	@GetMapping("/edit")
	public String editPersona(ModelMap model, @RequestParam("id") int id) {
		logger.info("-- en EDIT");
		model.addAttribute("persona", servicios.get(id));
		return "UserForm";		
	}

}
