package com.erick.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erick.cursomc.domain.Categoria;
import com.erick.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		
		return (Categoria) repo.findOne(id);
		
		
	}
	
	
}
