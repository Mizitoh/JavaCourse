package modelo.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String nome;
	
	@OneToOne(cascade = CascadeType.PERSIST) 
	// mais de uma opção cascata deve ser feita com chaves ou com all, vai salvar o assento junto, para funcionar o novocliente2
	// cria a chave estrangeira no banco
	@JoinColumn(name = "assento_id", unique = true) 
	// seta chave unica
	private Assento assento;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	
	
}
