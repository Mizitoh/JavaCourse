package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		// @valid para validar as anotações adicionadas em entidades
		produtoRepository.save(produto);
		return produto;
	}

	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
		// Iterable é o tipo do metodo findall, reutilizamos.
		// assim como Iquerable deve ser o tipo das funções do professor de asp
	}

	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutosByID(@PathVariable int id) {
		return produtoRepository.findById(id);
		// Iterable é o tipo do metodo findall, reutilizamos.
		// assim como Iquerable deve ser o tipo das funções do professor de asp
	}

	// alterar objeto inteiro
	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	/*
	 * metodo generico que abriga tanto o post quanto o put é sucesso!
	 * 
	 * @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	 * public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
	 * produtoRepository.save(produto); return produto; }
	 * 
	 */
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	/*consulta paginada*/
	
	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutoPorPagina(@PathVariable int numeroPagina){
		Pageable page = PageRequest.of(numeroPagina, 6);
		return produtoRepository.findAll(page);
	}
	// mais explicações na aula 437
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}

}
