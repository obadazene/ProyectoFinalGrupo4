package control;

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
import com.ejemplos.spring.model.User;
import com.spring.controller.EmpleadoController;
import com.spring.model.Empleado;
import com.spring.services.EmpleadoService;

@Controller
public class Control {
	
	@Autowired
	private ContactoServicios contactoServicios;
	private static final Logger logger = LoggerFactory.getLogger(Control.class);
	
	
	@GetMapping("/")
	public ModelAndView  listarContactos() throws Exception {
		System.out.println("--------dentro listarContactos");
		logger.info("-- Listado Contactos");
		List<Persona> listaContactos = contactoServicios.list();
		
		//logger.info("--"+listaContactos.toString());
		
		
		//System.out.println(listaContactos.toString());
		
		
		ModelAndView model = new ModelAndView("ListadoContactos");
		model.addObject("ListadoContactos", ListaContactos);
		return model;
	}	
	
	
	@GetMapping( "/addContacto")// Incluido el botón altaContacto dentro del paréntesis 
	public String addContacto(Model model) {
		logger.info("-- en Add");
		
		//ModelAndView model = new ModelAndView("AltaEmpleado");
		//model.addObject("contacto", add Contacto());
		//return model;
	
		model.addAttribute("AddContacto", new Persona());
		return "AddContacto";
	
	}
	
	//@DeleteMapping("/")
	@GetMapping("/delete")
	public ModelAndView delContacto(@RequestParam("id") int id) {
		logger.info("-- en DELETE");
		contactoServicios.delContacto(id);
		return new ModelAndView("redirect:/");		
	}

}
