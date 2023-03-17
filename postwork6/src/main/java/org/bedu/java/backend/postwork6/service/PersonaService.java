package org.bedu.java.backend.postwork6.service;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.bedu.java.backend.postwork6.model.Persona;
import org.bedu.java.backend.postwork6.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonaService {
    private PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public void addPersona(Persona persona) {
        personaRepository.addPersona(persona);
    }

    public Set<Persona> getPersonas() {
        return personaRepository.getPersonas();
    }
}
