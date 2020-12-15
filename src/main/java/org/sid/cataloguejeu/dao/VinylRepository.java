package org.sid.cataloguejeu.dao;

import org.sid.cataloguejeu.entities.Vinyl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VinylRepository extends JpaRepository<Vinyl,Long> {
}
