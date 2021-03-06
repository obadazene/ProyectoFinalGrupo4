package com.example.spring.servicios;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.dao.IRepositorio;
import com.example.spring.model.Persona;

/**
 * @author Groupo4 Clase servicios de la aplicacion
 */

@Service
@Transactional
public class Servicios implements IServicios {

	@Autowired
	private IRepositorio userRepository;
	private static final Logger logger = LoggerFactory.getLogger(Servicios.class);

	/**
	 * @return List<Persona>
	 */
	@Override
	public List<Persona> list() {
		logger.info("------ Servicios: en listaPersonas");
		return userRepository.findAll();
	}

	/**
	 * Método que llama al findPersona, se utiliza en editPersona
	 * 
	 * @param id
	 * @return Persona
	 */
	@Override
	public Persona findPersona(int id) {
		return userRepository.findOne(id);
	}

	/**
	 * Metodo que llama addPersona con el objeto userRepository
	 * 
	 * @param persona
	 */
	public void addPersona(Persona persona) {
		userRepository.save(persona);
	}

	/**
	 * Metodo que llama a delPersona con el objeto userRepository
	 * 
	 * @param id
	 */
	public void delPersona(int id) {
		userRepository.delete(id);
		;
	}

	/**
	 * Método que llama a delPersona
	 * 
	 * @param persona
	 * 
	 */
	@Override
	public void delPersona(Persona persona) {
		userRepository.delete(persona);

	}

	/**
	 * Método que llama a salvarPersona
	 * 
	 * @param persona
	 */

	@Override
	public void salvarPersona(Persona persona) {
		userRepository.save(persona);
	}

	/**
	 * Método que comprueba si la persona existe en la BBDD
	 * 
	 * @param persona
	 * @return boolean
	 */

	public boolean exists(Persona persona) {
		List<Persona> list = list();
		for (Persona person : list) {
			if (person.getNombre().equals(persona.getNombre()) & person.getApellido1().equals(persona.getApellido1())
					& person.getApellido2().equals(persona.getApellido2())) {
				System.out.println("--------------------- ContactoServiceImpl -> exists: true " + person);
				return true;
			}
		}
		System.out.println("----------------------- ContactoServiceImpl -> exists: false " + list);
		return false;
	}

	/**
	 * Este metodo devuelve el id de la persona si existe, o bien -1 si no existe
	 * 
	 * @param persona
	 * @return int
	 */
	public int existsAndGetId(Persona persona) {
		List<Persona> lista = list();
		for (Persona p : lista) {
			if (p.getNombre().equals(persona.getNombre()) & p.getApellido1().equals(persona.getApellido1())
					& p.getApellido2().equals(persona.getApellido2()) & p.getDni().equals(persona.getDni())) {
				System.out.println("-- ContactoServiceImpl(existsAndGetId) -> exists: true " + p);
				return p.getIdpersona();
			}
		}
		System.out.println("-- ContactoServiceImpl(existsAndGetId) -> exists: false " + lista);
		return -1;
	}

}
