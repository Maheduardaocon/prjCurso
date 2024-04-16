package com.example.demo.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	}
