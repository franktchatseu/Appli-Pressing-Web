package org.sid.web;

import java.sql.Date;
import java.util.List;

import org.sid.dao.ClientRepository;
import org.sid.dao.FactureRepository;
import org.sid.dao.RecuRepository;
import org.sid.dao.VetementRepository;
import org.sid.entitie.Client;
import org.sid.entitie.Facture;
import org.sid.entitie.Recu;
import org.sid.entitie.Vetement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AppliPressingRestController {

	@Autowired
	private VetementRepository vetementrepository;
	@Autowired
	private RecuRepository recurepository;
	@Autowired
	private FactureRepository facturerepository;
	@Autowired
	private ClientRepository clientrepository;
	@RequestMapping(value = "/livraison/{id}",method = RequestMethod.PUT)
	public Vetement livraison_vetement(@PathVariable Long id) {
		Vetement vetement=vetementrepository.findByidVetement(id);
		vetement.setEst_livrer(true);
		
		return vetementrepository.save(vetement);
	}
	
	//methode pour effecstuer un versement
	
	@RequestMapping(value = "/versement/{id}/{montant_verse}", method = RequestMethod.POST)
	public boolean versement(@PathVariable Long id, @PathVariable float montant_verse) {
		
		//recuperaiton de la fac
		Facture facture=(Facture)facturerepository.findByidFac(id);
		facture.setMontant_avance(facture.getMontant_avance()+montant_verse);
		//construction du recu
		Recu recu=new Recu();
		recu.setFacture(facture);
		recu.setDate_encaissement(new Date(1L));
		recu.setMontant_encaisse(montant_verse);
		recu.setNature("versement");
		//ajout du recu dans la base de donnee
		recurepository.save(recu);
		
		return true;
	}
	
}
