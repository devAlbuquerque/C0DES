package br.com.mazza.loja.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.mazza.loja.model.Carrinho;
import br.com.mazza.loja.model.Produto;

public class CarrinhoDAO {
	
	private static Map<Long, Carrinho> banco = new HashMap<Long, Carrinho>();
	private static AtomicLong contador = new AtomicLong(1);
	
	static {
		Produto videogame = new Produto(6237, "Videogame 4", 4000, 1);
		Produto esporte = new Produto(3467, "Jogo de esporte", 60, 2);
		Carrinho carrinho = new Carrinho()
				.adicionaProduto(videogame)
				.adicionaProduto(esporte).
				para("Rua sem nome", "Cidade desconhecida")
				.setId(1l);
	}
	
	public void adiciona(Carrinho carrinho) {
		long id = contador.incrementAndGet();
		carrinho.setId(id);
		banco.put(id, carrinho);
	}
	
	public Carrinho busca(Long id) {
		return banco.get(id);
	}
	
	public Carrinho remove(Long id) {
		return banco.remove(id);
	}

}
