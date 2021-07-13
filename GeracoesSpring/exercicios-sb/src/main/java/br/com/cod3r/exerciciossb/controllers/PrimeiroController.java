package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	//@GetMapping() ver aula 408 caso haja duvidas
	@RequestMapping/*por padrao aponta para um metodo get*/(method = RequestMethod.GET, path = "/ola")
	public String ola() {
		return "Olá Spring Boot!";
	}

}
