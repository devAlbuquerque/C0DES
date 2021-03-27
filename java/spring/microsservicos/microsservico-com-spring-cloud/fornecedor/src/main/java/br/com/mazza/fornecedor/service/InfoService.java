package br.com.mazza.fornecedor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.mazza.fornecedor.model.InfoFornecedor;
import br.com.mazza.fornecedor.repository.InfoRepository;

@Service
public class InfoService {

	private static final Logger LOG = LoggerFactory.getLogger(InfoService.class);
	
	@Autowired
	private InfoRepository infoRepository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		LOG.info("Informações buscadas");
		return infoRepository.findByEstado(estado);
	}

}
