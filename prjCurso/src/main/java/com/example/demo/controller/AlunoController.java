package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Aluno;
import com.example.demo.entities.Pessoa;
import com.example.demo.services.AlunoService;
import com.example.demo.services.PessoaService;


@RestController
@RequestMapping("/aluno")

public class AlunoController {
    private final AlunoService alunoService;

   
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.saveAluno(aluno);
    }

    @GetMapping("/{id}")
    public Aluno getAluno(@PathVariable Long id) {
        return alunoService.findAlunoById(id);
    }

    @GetMapping
    public List<Aluno> getAllAluno() {
        return alunoService.getAllAluno();
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
    	alunoService.findAlunoById(id);
    }
    
}
