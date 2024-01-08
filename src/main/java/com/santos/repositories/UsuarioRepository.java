package com.santos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santos.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>  {

}
