package br.com.mazza.loja.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mazza.loja.client.FornecedorClient;
import br.com.mazza.loja.dto.CompraDTO;
import br.com.mazza.loja.dto.InfoFornecedorDTO;
import br.com.mazza.loja.dto.InfoPedidoDTO;
import br.com.mazza.loja.model.Compra;
import ch.qos.logback.classic.Logger;

@Service
public class CompraService {

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(CompraService.class);
	
	@Autowired
	private FornecedorClient fornecedorClient;
		
	public Compra realizaCompra(CompraDTO compra) {
		
		final String estado = compra.getEndereco().getEstado();
		
		LOG.info("Buscando informações do fornecedor de {}", estado);
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(estado);
		
		LOG.info("Realizando um pedido");
		InfoPedidoDTO infoPedido = fornecedorClient.realizaPedido(compra.getItens());
		
		Compra compraSalva = new Compra();
		compraSalva.setPedidoId(infoPedido.getId());
		compraSalva.setTempoDePreparo(infoPedido.getTempoDePreparo());
		compraSalva.setEnderecoDestino(info.getEndereco());
		
		System.out.println(info.getEndereco());
		return compraSalva;
	}
}
