package br.com.mazza.fornecedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mazza.fornecedor.model.Produto;
import br.com.mazza.fornecedor.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/{estado}")
	public List<Produto> getProdutorPorEstado(@PathVariable("estado") String estado){
		return produtoService.getProdutosPorEstado(estado);
	}
	
}
