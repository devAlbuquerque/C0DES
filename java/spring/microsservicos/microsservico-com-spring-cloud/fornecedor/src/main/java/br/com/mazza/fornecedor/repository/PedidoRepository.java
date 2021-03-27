package br.com.mazza.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mazza.fornecedor.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
