package main;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.TbTipo;
import model.TbUsuario;

public class pruebas {
	
	// \\Suitesj202-serv\dawi_compartido

	public static void main(String[] args) {
		System.out.println("----------JPA CRUD------------");
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x1");
		EntityManager em = fabrica.createEntityManager();
		Query query =em.createNativeQuery("{call findall_usuarios()}",TbUsuario.class);
		List<TbUsuario> lstUsuario=query.getResultList();
		//mostar cantidad
		System.out.println("numero de usuarios: " +lstUsuario.size());
		System.out.println("----------------------");
		
		
		/*List<TbUsuario> tbusu= em.createQuery("select a from TbUsuario a", TbUsuario.class).getResultList();
		System.out.println("----------------------");*/

		
		
		
		
		 
		

	}

}
