package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Remote;

import sn.senForageEjb.entities.User;

@Remote
public interface IUserRemote {
	public List<User> liste();
	public int add(User user);

}
