package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		usuario.setNome("Mario");
		usuario.setEmail("mario@lanche.com.br");
		em.merge(usuario); // aqui em vez do persiste, ser� o merge que � respons�vel pelo update
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}

}
