package org.sid.entitie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vetement {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idVetement;
	private String observation;
	private boolean est_livrer;
	private int quantite;
	
	@ManyToOne
	@JoinColumn(name="idType")
	private TypeVetement typeVetement;
	
	@ManyToOne
	@JoinColumn(name="idFac")
	private Facture facture;

	public Vetement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vetement(String observation, boolean est_livrer, int quantite, TypeVetement typeVetement, Facture facture) {
		super();
		this.observation = observation;
		this.est_livrer = est_livrer;
		this.quantite = quantite;
		this.typeVetement = typeVetement;
		this.facture = facture;
	}

	public long getIdVetement() {
		return idVetement;
	}

	public void setIdVetement(long idVetement) {
		this.idVetement = idVetement;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public boolean isEst_livrer() {
		return est_livrer;
	}

	public void setEst_livrer(boolean est_livrer) {
		this.est_livrer = est_livrer;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public TypeVetement getTypeVetement() {
		return typeVetement;
	}

	public void setTypeVetement(TypeVetement typeVetement) {
		this.typeVetement = typeVetement;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
	
}
