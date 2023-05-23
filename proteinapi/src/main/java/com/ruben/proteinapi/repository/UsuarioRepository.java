package com.ruben.proteinapi.repository;

import com.ruben.proteinapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    //Agregar metods de consulta personalizada de ser necesario
}
