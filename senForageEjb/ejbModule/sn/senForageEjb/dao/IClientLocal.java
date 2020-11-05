package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Local;

import sn.senForageEjb.entities.Client;
import sn.senForageEjb.entities.Village;

@Local
public interface IClientLocal {

	public List<Client> list();
	public int add(Client client);
	//public List<Village> liste();
	
}
