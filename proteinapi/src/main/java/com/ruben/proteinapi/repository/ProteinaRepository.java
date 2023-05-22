package com.ruben.proteinapi.repository;


import com.ruben.proteinapi.model.Proteina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProteinaRepository extends JpaRepository<Proteina, Integer> {
    //Agregar metods de consulta personalizada de ser necesario
}
