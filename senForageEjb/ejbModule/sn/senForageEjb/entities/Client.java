package sn.senForageEjb.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import sn.senForageEjb.entities.Village;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private String adresse;
	@Column
	private String telephone;
	@ManyToOne
	@JoinColumn(name="id_village")
    private Village village ;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	
	/*
	 * public Client(int id, String nom, String adresse, String telephone, Village
	 * village) { super(); this.id = id; this.nom = nom; this.adresse = adresse;
	 * this.telephone = telephone; this.village = village; }
	 */

	public Village getVillage() {
		return village;
	}
	public void setVillage(Village village) {
		this.village = village;
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
   
}
