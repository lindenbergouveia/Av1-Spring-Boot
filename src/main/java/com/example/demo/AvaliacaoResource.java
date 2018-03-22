package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="CategoriaResource")

public class AvaliacaoResource {
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
	return "Avaliacao Terminada, Professor Chimpa!";
	}
}


