package com.pmaq.marquesconsult.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pmaq.marquesconsult.domain.Classificacao;
import com.pmaq.marquesconsult.sevices.ClassificacaoServise;

@RestController
@RequestMapping(value = "/classificacao")
public class ClassificacaoResource {


	@Autowired
	private ClassificacaoServise service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Classificacao obj = service.find(id);

		return ResponseEntity.ok().body(obj);


		
	}

}
