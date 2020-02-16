package com.erick.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erick.cursomc.domain.Cliente;
import com.erick.cursomc.exceptions.ObjectNotFoundException;
import com.erick.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	
	public Cliente buscar(Integer id) {
		
		Cliente obj = repo.findOne(id);
		if (obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: "+ id
					+ ", Tipo: " + Cliente.class.getName());
		}
		
		return obj;
	}
}
