package com.example.spring.servicios;

import java.util.List;



@service
@Transacional
public class Servicios implements IServicios {

	private IRepositorioCustom userRepository;


	@Override
	public void add(Contacto contacto) {
		userRepository.save(contacto);
	}


}
