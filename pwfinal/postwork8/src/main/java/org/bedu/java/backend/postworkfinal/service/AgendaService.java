package org.bedu.java.backend.postworkfinal.service;

import org.bedu.java.backend.postworkfinal.persistence.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.bedu.java.backend.postworkfinal.model.Persona;


import java.util.List;
import java.util.Set;


@Service
public class AgendaService {

    private final ValidadorTelefono validadorTelefono;
    private final PersonaRepository personaRepository;

    @Autowired
    public AgendaService(ValidadorTelefono validadorTelefono, PersonaRepository personaRepository) {
        this.validadorTelefono = validadorTelefono;
        this.personaRepository = personaRepository;
    }

    public Persona guardaPersona(Persona persona) {
        String telefono = validadorTelefono.limpiaNumero(persona.getTelefono());
        persona.setTelefono(telefono);
        return this.personaRepository.save(persona);
    }

    public List<Persona> getPersonas() {
        return this.personaRepository.findAll(Sort.by("nombre"));
        /*List<Persona> personaDB = personaRepository.findAll(Sort.by("nombre"));
        return personaDB;*/
    }
}

