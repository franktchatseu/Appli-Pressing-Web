package org.sid.dao;

import org.sid.entitie.Vetement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface VetementRepository extends JpaRepository<Vetement, Long> {

	public Vetement findByidVetement(Long id);
}
