package org.sid.entitie;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class TypeVetement {

	//propriete
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idType;
	private String nom_type;
	private float prix;
	
	@OneToMany(mappedBy ="typeVetement")
	private List<Vetement> listVetement;
	
	public TypeVetement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeVetement(String nom_type, float prix) {
		super();
		this.nom_type = nom_type;
		this.prix = prix;
	}
	
	public String getNom_type() {
		return nom_type;
	}
	public void setNom_type(String nom_type) {
		this.nom_type = nom_type;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public long getIdType() {
		return idType;
	}
	public void setIdType(long idType) {
		this.idType = idType;
	}

	
	
}
