package br.com.mazza.forum.controller.form;

import com.sun.istack.NotNull;

import br.com.mazza.forum.model.Curso;
import br.com.mazza.forum.model.Topico;
import br.com.mazza.forum.repository.CursoRepository;

public class TopicoForm {

	@NotNull
	private String titulo;
	
	@NotNull
	private String mensagem;
	
	@NotNull 
	private String nomeCurso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public Topico converter(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}
	
}
