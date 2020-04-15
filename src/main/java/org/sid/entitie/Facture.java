package org.sid.entitie;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Facture {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idFac;
	private Date date_delivrance;
	private Date date_retrait;
	private float montant_total;
	private float montant_avance;
	private boolean est_livrer;
	
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "login")
	private User user;
	
	@OneToMany(mappedBy = "facture")
	private List<Recu> listeRecu;

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdFac() {
		return idFac;
	}

	public void setIdFac(long idFac) {
		this.idFac = idFac;
	}

	public Date getDate_delivrance() {
		return date_delivrance;
	}

	public void setDate_delivrance(Date date_delivrance) {
		this.date_delivrance = date_delivrance;
	}

	public Date getDate_retrait() {
		return date_retrait;
	}

	public void setDate_retrait(Date date_retrait) {
		this.date_retrait = date_retrait;
	}

	public float getMontant_total() {
		return montant_total;
	}

	public void setMontant_total(float montant_total) {
		this.montant_total = montant_total;
	}

	public float getMontant_avance() {
		return montant_avance;
	}

	public void setMontant_avance(float montant_avance) {
		this.montant_avance = montant_avance;
	}

	public boolean isEst_livrer() {
		return est_livrer;
	}

	public void setEst_livrer(boolean est_livrer) {
		this.est_livrer = est_livrer;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Recu> getListeRecu() {
		return listeRecu;
	}

	public void setListeRecu(List<Recu> listeRecu) {
		this.listeRecu = listeRecu;
	}
	
	
}
