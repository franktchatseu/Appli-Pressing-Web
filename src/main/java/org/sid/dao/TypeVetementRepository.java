package org.sid.dao;

import org.sid.entitie.TypeVetement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeVetementRepository  extends JpaRepository<TypeVetement, Long>{

}
