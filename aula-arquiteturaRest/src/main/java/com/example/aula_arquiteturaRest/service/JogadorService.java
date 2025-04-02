package com.example.aula_arquiteturaRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula_arquiteturaRest.model.JogadosModel;
import com.example.aula_arquiteturaRest.repository.JogadorRepository;

@Service
public class JogadorService {

    @Autowired
    JogadorRepository jogadorRepository;

    public JogadosModel save(JogadosModel jogadosModel){
        return jogadorRepository.save(jogadosModel);
    }

    
}
