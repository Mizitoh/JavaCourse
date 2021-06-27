package Infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/*
 * DAO Data access Object with E, generic for entity.
 */

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe; // vai servir de parametro para a classe que virá, ou seja, as futuras entidades
								// que usaremos para bd e crud

	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("tem algum problema na classe DAO");
		}
	}

	public DAO() {
		this(null);
	}

	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}

	public DAO<E> abrirTransacao() {
		em.getTransaction().begin();
		return this;
	}

	public DAO<E> fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}

	public DAO<E> incluir(E entidade) {
		em.persist(entidade);
		return this;
	}

	/*
	 * atomico é usado para incluir varias coisas, considerando abertura e
	 * fechamento
	 */
	public DAO<E> incluirAtomico(E entidade) {
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public E obterPorID(Object id) {
		return em.find(classe, id);
	}
	
	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}

	public List<E> obterTodos(int qtdRegistros, int limitOffset) {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe Nula");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtdRegistros);
		query.setFirstResult(limitOffset);
		return query.getResultList();
	}
	
	public List<E> consultar(String nomeConsulta, Object... params){
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for (int i = 0; i < params.length; i+= 2) {
			/*
			 * for personalizado acrescentando de dois em dois
			 * pq ele cria um array com chave par valor
			 * o primeiro será o parametro e o segundo o valor
			 */
			query.setParameter(params[i].toString(), params[i +1]);
		}
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
}
