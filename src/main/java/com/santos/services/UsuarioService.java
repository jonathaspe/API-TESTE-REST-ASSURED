package com.santos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santos.domain.Usuario;
import com.santos.repositories.UsuarioRepository;
import com.santos.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não econtrado! Id: " + id + " ,Tipo: " + Usuario.class.getName()));
		
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario Update(Integer id, Usuario obj) {
		Usuario newObj = findById(id);
		
		newObj.setNome(obj.getNome());
		newObj.setLogin(obj.getLogin());
		newObj.setSenha(obj.getSenha());
		
		return repository.save(newObj);
	}

	public Usuario createUser(Usuario obj) {
		obj.setId(null);
		return repository.save(obj);
	}

}
