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
import com.example.demo.entities.Curso;
import com.example.demo.entities.Pessoa;
import com.example.demo.services.AlunoService;
import com.example.demo.services.CursoService;
import com.example.demo.services.PessoaService;


@RestController
@RequestMapping("/curso")

public class CursoController {
    private final CursoService cursoService;

   
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.saveCurso(curso);
    }

    @GetMapping("/{id}")
    public Curso getCurso(@PathVariable Long id) {
        return cursoService.findCursoById(id);
    }

    @GetMapping
    public List<Curso> getAllCurso() {
        return cursoService.getAllCurso();
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Long id) {
    	cursoService.findCursoById(id);
    }
    
}

