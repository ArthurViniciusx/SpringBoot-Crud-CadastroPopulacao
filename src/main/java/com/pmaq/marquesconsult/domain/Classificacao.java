package com.pmaq.marquesconsult.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "classificacao")
public class Classificacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String descricao;

	@OneToMany(mappedBy = "classificacao")
	private List<Populacao> populacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Populacao> getPopulacao() {
		return populacao;
	}

	public void setPopulacao(List<Populacao> populacao) {
		this.populacao = populacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
