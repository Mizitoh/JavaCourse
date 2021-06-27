package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) // não cria a tabela seuence hibernate, cada usuario tera sua propria 
	//sequencia de id
	//no caso de banco oracle ou postgree usamos o sequence
	private Long id;
	//quando não se coloca nenhuma notation ele segue convenções
	private String nome;
	//@transient do javax persistence não manda o atributo pro banco de dados
	private String email;
			
	public Usuario() {
		super();
	}

	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
