package org.sid.dao;

import org.sid.entitie.Recu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RecuRepository extends JpaRepository<Recu, Long> {

}
