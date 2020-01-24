package com.pmaq.marquesconsult.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Populacao_unidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer data_insercao;
	private Integer classificacao_id;

	public Populacao_unidade() {

	}

	public Populacao_unidade(Integer data_insercao, Integer classificacao_id) {
		super();
		this.data_insercao = data_insercao;
		this.classificacao_id = classificacao_id;
	}

	public Integer getData_insercao() {
		return data_insercao;
	}

	public void setData_insercao(Integer data_insercao) {
		this.data_insercao = data_insercao;
	}

	public Integer getClassificacao_id() {
		return classificacao_id;
	}

	public void setClassificacao_id(Integer classificacao_id) {
		this.classificacao_id = classificacao_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classificacao_id == null) ? 0 : classificacao_id.hashCode());
		result = prime * result + ((data_insercao == null) ? 0 : data_insercao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Populacao_unidade other = (Populacao_unidade) obj;
		if (classificacao_id == null) {
			if (other.classificacao_id != null)
				return false;
		} else if (!classificacao_id.equals(other.classificacao_id))
			return false;
		if (data_insercao == null) {
			if (other.data_insercao != null)
				return false;
		} else if (!data_insercao.equals(other.data_insercao))
			return false;
		return true;
	}

}
