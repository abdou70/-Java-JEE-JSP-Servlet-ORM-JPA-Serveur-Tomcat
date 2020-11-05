package sn.senForageEjb.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

import sn.senForageEjb.entities.Client;

/**
 * Entity implementation class for Entity: Village
 *
 */
@Entity

public class Village implements Serializable {

	   
	/*
	 * public Collection<Client> getClients() { return clients; } public void
	 * setClients(Collection<Client> clients) { this.clients = clients; }
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@OneToMany(mappedBy="village",fetch =FetchType.LAZY, targetEntity=Client.class)
	private Collection<Client> clients;
	private static final long serialVersionUID = 1L;

	public Village() {
		super();
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
   
}
