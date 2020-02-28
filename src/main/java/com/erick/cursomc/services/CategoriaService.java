package com.erick.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erick.cursomc.domain.Categoria;
import com.erick.cursomc.exceptions.ObjectNotFoundException;
import com.erick.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria find(Integer id) {
		
		Categoria obj = repo.findOne(id);
		if (obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: "+ id
					+ ", Tipo: " + Categoria.class.getName());
		}
		
		return obj;
	}


	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}


	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}
