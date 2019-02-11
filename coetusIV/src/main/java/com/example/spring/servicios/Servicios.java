package com.example.spring.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

	@Override
	public List<Persona> list() {
		return userRepository.findAll();
	}

	// Método que llama al findPersona, se utiliza en editPersona
	@Override
	public Persona findPersona(int id) {
		return userRepository.findOne(id);
	}

	// Metodo que llama addPersona con el objeto userRepository
	@Override
	public void addPersona(Persona persona) {
		userRepository.save(persona);
	}

	// Metodo que llama a delContacto con el objeto userRepository
	@Override
	public void delPersona(int id) {
		userRepository.delete(id);
	}

	// Método que llama a salvarPersona
	@Override
	public void salvarPersona(Persona persona) {
		userRepository.save(persona);
	}

}