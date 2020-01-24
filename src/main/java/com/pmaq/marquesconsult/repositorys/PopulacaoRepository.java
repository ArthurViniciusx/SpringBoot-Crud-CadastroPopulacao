package com.pmaq.marquesconsult.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmaq.marquesconsult.domain.Populacao;

public interface PopulacaoRepository extends JpaRepository<Populacao, Integer> {
	Populacao findById(long id);
	
}
