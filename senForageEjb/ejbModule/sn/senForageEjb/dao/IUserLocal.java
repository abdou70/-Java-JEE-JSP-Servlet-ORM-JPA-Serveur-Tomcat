package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Local;

import sn.senForageEjb.entities.User;


@Local
public interface IUserLocal {
	public List<User> liste();
	public int add(User user);

}
