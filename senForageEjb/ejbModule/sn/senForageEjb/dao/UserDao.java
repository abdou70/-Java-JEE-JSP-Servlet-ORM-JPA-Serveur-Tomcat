package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.senForageEjb.entities.User;

@Stateless
public class UserDao implements IUserLocal,IUserRemote{
	@PersistenceContext(unitName="senForageEjb")
    private EntityManager  em;
	@Override
	public List<User> liste() {
		return em.createQuery("SELECT c FROM User c").getResultList();
	}

	@Override
	public int add(User user) {
		int ok = 0;
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			ok=1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return ok;
	}
	

}
