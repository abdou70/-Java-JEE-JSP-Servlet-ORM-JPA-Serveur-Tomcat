package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Remote;

import sn.senForageEjb.entities.Client;

@Remote
public interface IClientRemote {
	
	public List<Client> list();
	public int add(Client client);

}
