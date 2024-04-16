package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Aluno;
import com.example.demo.repostories.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoService (AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    
    public Aluno findAlunoById(Long id) {
        Optional<Aluno> Aluno = alunoRepository.findById(id);
        return Aluno.orElse(null);
    }

   
    public List<Aluno> findAllAluno() {
        return alunoRepository.findAll();
    }

    
    public Aluno insertAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

	public Aluno getAlunoById(long funcodigo) {
		return alunoRepository.findById(funcodigo).orElse(null);
	}
	
	public List<Aluno> getAllAluno() {
		return alunoRepository.findAll();
	}

    
}