package br.com.mazza.fornecedor.service;

import java.util.List;

import br.com.mazza.fornecedor.model.Produto;
import br.com.mazza.fornecedor.repository.ProdutoRepository;

public class ProdutoService {
	
	private ProdutoRepository produtoRepository;

	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

}
