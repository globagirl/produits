package formalab.gestion.produits.repositories;

import formalab.gestion.produits.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepository extends JpaRepository<Command, Long> {
}
