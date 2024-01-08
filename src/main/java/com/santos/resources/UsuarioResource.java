package com.santos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santos.domain.Usuario;
import com.santos.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")

public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;

	//Metodo find by ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario>findById(@PathVariable Integer id){
		Usuario obj = this.service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> list= service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
}
