package br.com.mercado.test;

//import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mercado.model.Estoque;

public class Teste {
			
		
		//find
	//	Estoque estoque1  = entityManager.find(Estoque.class, 1);
	//	System.out.println("nome encotrado" + estoque1.getNome();
		
		
		
		public static void main(String[] args) {

			Estoque estoque = new Estoque ();
			estoque.setNome("Arroz");
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mercado");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			entityManager.getTransaction().begin();
			entityManager.persist(estoque);
			entityManager.getTransaction().commit();
			entityManager.close();
			
		}
		
		
		//insert 
		
		
		
		//delete 
		//Estoque estoque = entityManager.find(null, estoque2);
	//	entityManager.getTransaction().begin();
	//	entityManager.remove(estoque2);
	//	entityManager.getTransaction().commit();
		
		
		
		
		
		
		//modify
	//	Estoque estoque = new Estoque ();
		//estoque1.setId(1);
	//	estoque1.setNome("arroz branco");
		
		//entityManager.getTransaction().begin();
		//entityManager.merge(estoque2);
		//entityManager.getTransaction().commit();
		
		


}
