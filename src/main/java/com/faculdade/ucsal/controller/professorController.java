package com.faculdade.ucsal.controller;

import com.faculdade.ucsal.entity.professor;
import com.faculdade.ucsal.service.dadosProf;
import com.faculdade.ucsal.service.professorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("professor")
public class professorController {
    @Autowired
    private professorRepository repository;

    @PostMapping
    public void cadastro(@RequestBody dadosProf dados ){
        repository.save(new professor(dados));
    }

}
