package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.senForageEjb.entities.Village;

@Stateless
public class VillageDao implements IVillageLocal{
	@PersistenceContext(unitName="senForageEjb")
	private EntityManager  em;
	@SuppressWarnings("unchecked")
	@Override
	public List<Village> liste() {
		
		return  em.createQuery("SELECT c FROM Village c").getResultList();
	}

	@Override
	public int add(Village village) {
		int ok = 0;
		try {
			//em.getTransaction().begin();
			em.persist(village);
			//em.getTransaction().commit();
			ok=1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public Village getVillage(int id_village) {
	 Village village = (Village) em.createQuery("SELECT c FROM Village c WHERE c.id=:n")
			 .setParameter("n", id_village).getSingleResult();

		return village;
	}
	

}
