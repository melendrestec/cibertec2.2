package com.cibertec.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Categoria;

public interface ICategoriaDAO extends JpaRepository<Categoria, Integer> {

}
