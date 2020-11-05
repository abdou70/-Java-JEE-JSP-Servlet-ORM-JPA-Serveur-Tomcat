package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Remote;

import sn.senForageEjb.entities.Village;

@Remote
public interface IVillageRemote {
	public List<Village> liste();
	public int add(Village village);

}
