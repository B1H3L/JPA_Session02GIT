package main;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbTipo;
import model.TbUsuario;

public class pruebas {
	
	// \\Suitesj202-serv\dawi_compartido

	public static void main(String[] args) {
		System.out.println("----------JPA CRUD------------");
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x1");
		EntityManager em = fabrica.createEntityManager();
		List<TbUsuario> tbusu= em.createQuery("select a from TbUsuario a", TbUsuario.class).getResultList();
		System.out.println("----------------------");
		//mostar cantidad
		System.out.println("numero de usuarios: " +tbusu.size());
		System.out.println("----------------------");
		
		
		
		
		 
		

	}

}
