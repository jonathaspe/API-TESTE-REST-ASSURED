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
		
		Usuario u1 = new Usuario(null,"Rafael Santos", "rafael.santos", "234567");
		Usuario u2 = new Usuario(null,"Albert Einstein", "albert.einstein", "76543");
		Usuario u3 = new Usuario(null,"Bruna Caroline", "bruna.caroline", "12356");
		Usuario u4 = new Usuario(null,"Lenice Stavarengo", "leninha.stavarengo", "5678765");
		Usuario u5 = new Usuario(null,"Maria da Conceição", "maria.conceicao", "5367843");
		Usuario u6 = new Usuario(null,"Isabele Prudente", "isabele.prudente", "09876");
		Usuario u7 = new Usuario(null,"Ana Silva", "rafael.santos", "7873256");
		Usuario u8 = new Usuario(null,"Isabel Alencar", "isabel.alencar", "342536");
		Usuario u9 = new Usuario(null,"Catarina Rosa", "catarina.rosa", "078967");
		Usuario u10 = new Usuario(null,"Antônia Julieta", "antonia.julieta", "3124567890");
		Usuario u11 = new Usuario(null,"Joana Dark", "joana.dark", "879654342");
		Usuario u12 = new Usuario(null,"Francisca Ferreira", "francisca.ferreira", "12345678");
		Usuario u13 = new Usuario(null,"Rosa Madalena", "rosa.madalena", "9876543");
		Usuario u14 = new Usuario(null,"Mariana Fernandes", "mariana.fernandes", "09876543");
		Usuario u15 = new Usuario(null,"Teresa Joaquina", "teresa.joaquina", "0923456");
		Usuario u16 = new Usuario(null,"Alice Silva", "alice.silva", "6789543");
		Usuario u17 = new Usuario(null,"Luísa Mello", "luísa.mello", "0987654");
		Usuario u18 = new Usuario(null,"Margarida Neves", "margarida.neves", "98675754");



		
		
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
		
	}

}
