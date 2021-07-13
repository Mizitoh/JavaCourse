package br.com.cod3r.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	// @PostMapping
	// public @ResponseBody Produto novoProduto(@RequestParam String nome,
	// @RequestParam double preco, @RequestParam double desconto) {
	// Produto produto = new Produto(nome, preco, desconto);
	// produtoRepository.save(produto);
	// return produto;
	// } // o metodo abaixo é mais pratico, o spring ja faz a instanciação

	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		//@valid para validar as anotações adicionadas em entidades
		produtoRepository.save(produto);
		return produto;
	}

}