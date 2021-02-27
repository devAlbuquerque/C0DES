package br.com.mazza.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mazza.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);
	
}
