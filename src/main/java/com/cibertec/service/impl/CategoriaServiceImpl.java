package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.commons.GenericServiceImpl;
import com.cibertec.dao.ICategoriaDAO;
import com.cibertec.model.Categoria;
import com.cibertec.service.ICategoriaService;

public class CategoriaServiceImpl extends GenericServiceImpl<Categoria, Integer> implements ICategoriaService {

	
	@Autowired
	ICategoriaDAO categoriaDao;
	
	@Override
	public JpaRepository<Categoria, Integer> getDao() {
		// TODO Auto-generated method stub
		return categoriaDao;
	}

}
