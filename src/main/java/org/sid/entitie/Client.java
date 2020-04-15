package org.sid.entitie;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {

	//proprietes
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	private String nom_client;
	private String tel_client;
	private String ville_client;
	
	@OneToMany(mappedBy = "client")
	private List<Facture> listFacture;
	
	public Client(String nom_client, String tel_client, String ville_client) {
		super();
		this.nom_client = nom_client;
		this.tel_client = tel_client;
		this.ville_client = ville_client;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public List<Facture> getListFacture() {
		return listFacture;
	}
	public void setListFacture(List<Facture> listFacture) {
		this.listFacture = listFacture;
	}
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public String getTel_client() {
		return tel_client;
	}
	public void setTel_client(String tel_client) {
		this.tel_client = tel_client;
	}
	public String getVille_client() {
		return ville_client;
	}
	public void setVille_client(String ville_client) {
		this.ville_client = ville_client;
	}
	
	
}
