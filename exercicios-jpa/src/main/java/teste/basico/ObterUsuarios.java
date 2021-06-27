package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class); /* esse atributo classe chama se reflection
																		  * vai pegar tudo que tem na classe, olha pra classe 
																		  * e entende como foi construida
																		  */
		query.setMaxResults(5); //maximo de resultados
		
		/* outra mandeira de fazer:
		 * List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class).setMaxResults(5).getResultList();
		 */
		
		List<Usuario> usuarios = query.getResultList();
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getId() 
					+ " - " + usuario.getNome() 
					+ " - " + usuario.getEmail());
		}

		em.close();
		emf.close();
	}

}
