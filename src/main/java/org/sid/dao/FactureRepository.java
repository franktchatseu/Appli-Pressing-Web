package org.sid.dao;

import org.sid.entitie.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FactureRepository extends JpaRepository<Facture, Long>{
	
	public Facture findByidFac(Long id);
}
