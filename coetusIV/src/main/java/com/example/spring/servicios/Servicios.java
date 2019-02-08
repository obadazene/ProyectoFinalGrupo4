package com.example.spring.servicios;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.spring.dao.IRepositorio;
import com.example.spring.dao.IRepositorioCustom;
import com.example.spring.model.Persona;

/*
* @Author Antonio Portela
* Clase servicios de la aplicacion
*/

@Service
@Transactional
public class Servicios implements IServicios {

    private IRepositorio userRepository;

    @Override
    public Persona getPersona(int id) { // Método que llama al Get, se utiliza en editPersona
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
    
    @Override
    public void salvarPersona(Persona persona) {// Método que llama a salvarPersona
           userRepository.save(persona);
    }

	@Override
	public Persona findPersona(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}