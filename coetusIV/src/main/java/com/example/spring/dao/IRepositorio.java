package com.example.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.spring.model.Persona;

/**
 * 
 * @author Grupo4
 *
 */
@Repository
//Spring Data JpaRepository interface extends CrudRepository and provides finder methods out of the box
public interface IRepositorio extends JpaRepository<Persona, Integer> {
}
