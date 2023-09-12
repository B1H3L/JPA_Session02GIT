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
		//listar usuario
		Query query =em.createNativeQuery("{call usp_validaAcceso(?,?)}",TbUsuario.class);
		query.setParameter(1,"u001@gmail.com");
		query.setParameter(2,"10001");
		TbUsuario u=(TbUsuario)query.getSingleResult();
		if(u==null){
			System.out.println("El usuario no existe");}
		else{
			System.out.println("Bienvenido:"+u.getNomUsua()+" "+u.getApeUsua());
			
		}
		
		//List<TbUsuario> lstUsuario=query.getResultList();
		/*List<TbUsuario> tbusu= em.createQuery("select a from TbUsuario a", TbUsuario.class).getResultList();
		System.out.println("----------------------");*/

		
		
		
		
		 
		

	}

}
