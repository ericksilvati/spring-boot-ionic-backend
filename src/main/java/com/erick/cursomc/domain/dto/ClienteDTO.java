package com.erick.cursomc.domain.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.erick.cursomc.domain.Cliente;
import com.erick.cursomc.services.validation.ClienteUpdate;
@ClienteUpdate
public class ClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	public ClienteDTO() {}
	
	public ClienteDTO (Cliente obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.setEmail(obj.getEmail());
	}
		
	private Integer id;
	@NotEmpty(message="Preenchimento Obrigatório")
	@Length(min=5, max=120, message="O tamenho deve ser entre 5 e 120 caracteres")
	private String nome;
	@NotEmpty(message="Preenchimento Obrigatório")
	@Email (message="Email inválido")
	private String email;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
