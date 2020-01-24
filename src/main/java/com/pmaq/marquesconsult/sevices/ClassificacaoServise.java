package com.pmaq.marquesconsult.sevices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmaq.marquesconsult.domain.Classificacao;
import com.pmaq.marquesconsult.repositorys.ClassificacaopRepository;

@Service
public class ClassificacaoServise {

	@Autowired
	private ClassificacaopRepository repo;

	public Classificacao find(Integer id) {
		Optional<Classificacao> obj = repo.findById(id);
		return obj.orElse(null);

	}

}
