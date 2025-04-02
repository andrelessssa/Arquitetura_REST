package com.example.aula_arquiteturaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula_arquiteturaRest.model.JogadosModel;

public interface JogadorRepository extends JpaRepository<JogadosModel, Long>{
    
}
