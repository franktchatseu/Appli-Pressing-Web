package org.sid.entitie;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Recu {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_recu;
	private float montant_encaisse;
	private Date date_encaissement;
	private String nature;
	
	@ManyToOne
	@JoinColumn(name = "idFac")
	private Facture facture;
	
	public Recu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recu(float montant_encaisse, Date date_encaissement, String nature) {
		super();
		
		this.montant_encaisse = montant_encaisse;
		this.date_encaissement = date_encaissement;
		this.nature = nature;
	}
	public Long getId_recu() {
		return id_recu;
	}
	public void setId_recu(Long id_recu) {
		this.id_recu = id_recu;
	}
	public float getMontant_encaisse() {
		return montant_encaisse;
	}
	public void setMontant_encaisse(float montant_encaisse) {
		this.montant_encaisse = montant_encaisse;
	}
	public Date getDate_encaissement() {
		return date_encaissement;
	}
	public void setDate_encaissement(Date date_encaissement) {
		this.date_encaissement = date_encaissement;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
	
}
