package br.com.devkazu.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devkazu.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/candidate") 
public class CandidateController {
  

  @PostMapping(value="/")
  public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
      
     System.out.println(candidateEntity);
  }
  
}
