package org.bedu.java.backend.postworkfinal.persistence;

import org.bedu.java.backend.postworkfinal.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
