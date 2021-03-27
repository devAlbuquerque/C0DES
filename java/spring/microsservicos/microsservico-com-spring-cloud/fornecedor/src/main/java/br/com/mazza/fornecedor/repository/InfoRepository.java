package br.com.mazza.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mazza.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {

	InfoFornecedor findByEstado(String estado);

}
