package com.example.spring.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class Servicios implements IServicios {

	private IRepositorioCustom userRepository;


	@Override
	public void addContacto(Contacto contacto) {
		userRepository.save(contacto);
	}
	
	@Override
	public void delContacto(int id) {
		userRepository.delete(id);
	}


}
