package org.sid.cataloguejeu.dao;

import org.sid.cataloguejeu.entities.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JeuRepository extends JpaRepository<Jeu,Long> {
}
