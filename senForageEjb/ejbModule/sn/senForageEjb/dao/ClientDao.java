package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import sn.senForageEjb.entities.Client;
import sn.senForageEjb.entities.Village;

@Stateless
public class ClientDao implements IClientLocal{
    @PersistenceContext(unitName="senForageEjb")
    private EntityManager  em;
	/*
	 * public ClientDao() { EntityManagerFactory emf = Persistence
	 * .createEntityManagerFactory("senForageEjb"); em = emf.createEntityManager();
	 * }
	 */

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> list(){
		
		return  em.createQuery("SELECT c FROM Client c").getResultList();
	}
	/*
	 * @Override public List<Village> liste() { return
	 * em.createQuery("SELECT c FROM Village c").getResultList(); }
	 */

	@Override
	public int add(Client client) {
		int ok = 0;
		try {
			//em.getTransaction().begin();
			em.persist(client);
			//em.getTransaction().commit();
			ok=1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return ok;
	}

}
