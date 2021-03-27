package br.com.mazza.fornecedor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mazza.fornecedor.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<Long> ids);
}
