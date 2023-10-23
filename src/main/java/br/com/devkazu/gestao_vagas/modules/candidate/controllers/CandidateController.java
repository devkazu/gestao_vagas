package br.com.devkazu.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/candidate") 
public class CandidateController {
  

  @PostMapping(value="path")
  public void create() {
      //TODO: process POST request
      
     
  }
  
}
