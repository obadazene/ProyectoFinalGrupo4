package com.example.spring.servicios;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.control.Control;
import com.example.spring.dao.IRepositorio;
import com.example.spring.model.Persona;

/*
* @Author Groupo4
* Clase servicios de la aplicacion
*/

@Service
@Transactional
public class Servicios implements IServicios {

	@Autowired
	private IRepositorio userRepository;
	private static final Logger logger = LoggerFactory.getLogger(Servicios.class);	

	@Override
	public List<Persona> list() {
		logger.info("------ Servicios: en listaPersonas");
		return userRepository.findAll();
	}

	// Método que llama al findPersona, se utiliza en editPersona
	@Override
	public Persona findPersona(int id) {
		return userRepository.findOne(id);
	}

	// Metodo que llama addPersona con el objeto userRepository
	public void addPersona(Persona persona) {
		userRepository.save(persona);
	}

	// Metodo que llama a delContacto con el objeto userRepository
	public void delPersona(int id) {
		userRepository.delete(id);
	}
	
	@Override
	public void delPersona(Persona persona) {
		userRepository.delete(persona);
		
	}

	// Método que llama a salvarPersona
	@Override
	public void salvarPersona(Persona persona) {
		userRepository.save(persona);
	}

	public boolean exists(Persona per) {
		List<Persona> list = list();
		for(Persona person:list) {
			if(person.getNombre().equals(per.getNombre())&
					person.getApellido1().equals(per.getApellido1())&
					person.getApellido2().equals(per.getApellido2())) {
				System.out.println("--------------------- ContactoServiceImpl > exists: true "+person);
				return true;
			}
		}
		System.out.println("----------------------- ContactoServiceImpl > exists: false "+list);
		return false;
	}
	
	/**
	 * Este metodo devuelve el ID de la persona si existe, o bien -1 si no existe
	 * @param per
	 * @return
	 */
	public int existsAndGetId(Persona per) {
		List<Persona> list = list();
		for(Persona person:list) {
			if(person.getNombre().equals(per.getNombre())&
					person.getApellido1().equals(per.getApellido1())&
					person.getApellido2().equals(per.getApellido2())) {
				System.out.println("-- ContactoServiceImpl(existsAndGetId) > exists: true "+person);
				return person.getIdpersona();
			}
		}
		System.out.println("-- ContactoServiceImpl(existsAndGetId) > exists: false "+list);
		return -1;
	}	

}

