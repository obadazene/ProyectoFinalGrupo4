package com.example.spring.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.dao.IRepositorioCustom;
import com.example.spring.model.Contacto;

/*
 * @Author Antonio Portela 
 * Clase servicios de la aplicacion
 */

@Service
@Transactional
public class Servicios implements IServicios {

	private IRepositorioCustom userRepository;

	//Metodo que llama a addContacto con el objeto userRepository
	@Override
	public void addContacto(Contacto contacto) {
		userRepository.save(contacto);
	}
	//Metodo que llama a delContacto con el objeto userRepository
	@Override
	public void delContacto(int id) {
		userRepository.delete(id);
	}


}
