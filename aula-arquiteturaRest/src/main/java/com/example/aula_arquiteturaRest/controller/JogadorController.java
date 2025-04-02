package com.example.aula_arquiteturaRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula_arquiteturaRest.model.JogadosModel;
import com.example.aula_arquiteturaRest.service.JogadorService;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    JogadorService jogadorService;

    @PostMapping
    public ResponseEntity<JogadosModel> save(@RequestBody JogadosModel jogadosModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorService.save(jogadosModel));
        
    }
    
}
