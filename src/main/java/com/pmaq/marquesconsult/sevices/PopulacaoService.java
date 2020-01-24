package com.pmaq.marquesconsult.sevices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pmaq.marquesconsult.domain.Populacao;
import com.pmaq.marquesconsult.repositorys.PopulacaoRepository;

public class PopulacaoService {

	
	@Autowired
	private PopulacaoRepository repo;
	
	
	public Populacao find(Integer id) {
		Optional<Populacao> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
