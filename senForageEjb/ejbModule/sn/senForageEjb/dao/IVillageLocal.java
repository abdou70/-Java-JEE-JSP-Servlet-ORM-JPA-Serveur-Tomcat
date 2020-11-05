package sn.senForageEjb.dao;

import java.util.List;

import javax.ejb.Local;

import sn.senForageEjb.entities.Village;

@Local
public interface IVillageLocal {
	public List<Village> liste();
	public int add(Village village);
	public Village getVillage(int id_village);

}
