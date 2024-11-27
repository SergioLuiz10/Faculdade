package com.faculdade.ucsal.controller;

import com.faculdade.ucsal.entity.professor;
import com.faculdade.ucsal.service.dadosListagem;
import com.faculdade.ucsal.service.dadosProf;
import com.faculdade.ucsal.service.dadosUp;
import com.faculdade.ucsal.service.professorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("professor")
public class professorController {
    @Autowired
    private professorRepository repository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody dadosProf dados ){
        repository.save(new professor(dados));
    }

    @GetMapping
    public Page<dadosListagem> listagem(@PageableDefault(size = 10, sort = "nome") Pageable pageable) {
        return repository.findAll(pageable).map(dadosListagem::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody dadosUp up){
    var prof = repository.getReferenceById(up.id());
    prof.update(up);

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);

    }

}
