package br.com.mazza.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mazza.loja.dto.CompraDTO;
import br.com.mazza.loja.model.Compra;
import br.com.mazza.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private CompraService compraService;

	@RequestMapping(method = RequestMethod.POST)
	public Compra realizaCompra(@RequestBody CompraDTO compra) {
		return compraService.realizaCompra(compra);
	}
	
}
