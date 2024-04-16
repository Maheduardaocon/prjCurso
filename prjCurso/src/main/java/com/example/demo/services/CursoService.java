package com.example.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Curso;
import com.example.demo.repostories.CursoRepository;



@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoService (CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    
    public Curso findCursoById(Long id) {
        Optional<Curso> Curso = cursoRepository.findById(id);
        return Curso.orElse(null);
    }

   
    public List<Curso> findAllCurso() {
        return cursoRepository.findAll();
    }

    
    public Curso insertCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

	public Curso getCursoById(long funcodigo) {
		return cursoRepository.findById(funcodigo).orElse(null);
	}
	
	public List<Curso> getAllCurso() {
		return cursoRepository.findAll();
	}

    
}
