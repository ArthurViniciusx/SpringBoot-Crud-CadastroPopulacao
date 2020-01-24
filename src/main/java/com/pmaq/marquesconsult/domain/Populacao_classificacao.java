package com.pmaq.marquesconsult.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Populacao_classificacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer populacao_id;
	private Integer classificacao_id;

	public Populacao_classificacao() {

	}

	public Populacao_classificacao(Integer populacao_id, Integer classificacao_id) {
		super();
		this.populacao_id = populacao_id;
		this.classificacao_id = classificacao_id;
	}

	public Integer getPopulacao_id() {
		return populacao_id;
	}

	public void setPopulacao_id(Integer populacao_id) {
		this.populacao_id = populacao_id;
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
		result = prime * result + ((populacao_id == null) ? 0 : populacao_id.hashCode());
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
		Populacao_classificacao other = (Populacao_classificacao) obj;
		if (classificacao_id == null) {
			if (other.classificacao_id != null)
				return false;
		} else if (!classificacao_id.equals(other.classificacao_id))
			return false;
		if (populacao_id == null) {
			if (other.populacao_id != null)
				return false;
		} else if (!populacao_id.equals(other.populacao_id))
			return false;
		return true;
	}

}
