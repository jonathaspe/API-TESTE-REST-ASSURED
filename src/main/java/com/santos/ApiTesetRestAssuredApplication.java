package com.santos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.santos.domain.Usuario;
import com.santos.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiTesetRestAssuredApplication implements CommandLineRunner {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiTesetRestAssuredApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null,"Rafael Santos", "rafael.santos", "12356");
		Usuario u2 = new Usuario(null,"Albrt Einstain", "albert.bomba", "12356");
		Usuario u3 = new Usuario(null,"Bruna Caroline", "b.carol", "12356");
		Usuario u4 = new Usuario(null,"Lenice Stravenga", "leninha.strava", "12356");
		Usuario u5 = new Usuario(null,"Maria da Conceição", "maria.conceicao", "12356");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
		
	}

}
