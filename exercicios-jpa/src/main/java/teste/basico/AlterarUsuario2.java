package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		usuario.setNome("Mario");
		usuario.setEmail("mario@lanche.com.br");
		
		//em.merge(usuario); mesmo sem merge ele atualiza pq está no estado gerenciado
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}

}
