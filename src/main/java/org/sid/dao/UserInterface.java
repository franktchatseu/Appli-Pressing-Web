package org.sid.dao;

import org.sid.entitie.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserInterface extends JpaRepository<Utilisateur, Long>{

	
}
