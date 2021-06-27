package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		
		em.detach(usuario); // retira o dado do estado gerenciado
		
		usuario.setNome("Mario Andrade");
		usuario.setEmail("mario@lanche.com.br");
		
		//em.merge(usuario); adapta para o estado gerenciado e faz um update, no dia a dia, siga a alteraão 1 dos exercícios
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}

}
