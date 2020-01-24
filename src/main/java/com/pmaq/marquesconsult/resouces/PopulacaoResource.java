package com.pmaq.marquesconsult.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmaq.marquesconsult.domain.Populacao;
import com.pmaq.marquesconsult.repositorys.PopulacaoRepository;

@

RestController
@RequestMapping(value = "/api")
public class PopulacaoResource {
	@Autowired
	PopulacaoRepository populacaoRepository;

	@GetMapping("/populacao")
	public List<Populacao> listaPopulacao() {
		return populacaoRepository.findAll();
	}

	@GetMapping("/populacao/{id}")
	public Populacao listaPopulacaoId(@PathVariable(value = "id") long id) {
		return populacaoRepository.findById(id);
	}

	@PostMapping("/populacao")
	public Populacao salvaPopulacao(@RequestBody Populacao populacao) {
		return populacaoRepository.save(populacao);
	}

	@DeleteMapping("/populacao")
	public void deletaPopulacao(@RequestBody Populacao populacao) {
		populacaoRepository.delete(populacao);
	}

	@PutMapping("/populacao")
	public Populacao atualizaPopulacao(@RequestBody Populacao populacao) {
		return populacaoRepository.save(populacao);
	}
}