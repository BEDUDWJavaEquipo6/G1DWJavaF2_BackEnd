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

        if(validadorTelefono.Valida(persona.getTelefono())){
            System.out.println("Obj Persona capturado: "+persona);
            persona.setTelefono(ValidadorTelefono.Comprueba(persona.getTelefono()));
            System.out.println("Ejecutando limpieza del teléfono metodo Comprueba(): "+persona.getTelefono());
            persona.setTelefono(ValidadorTelefono.formatear(persona.getTelefono()));
            System.out.println("Dando formato al teléfono con metodo formatear(): "+persona.getTelefono());
            return personaRepository.save(persona);
        }else {
            System.out.println("Telefono no valido");}
        //persona.setTelefono(ValidadorTelefono.formatear(persona.getTelefono()));
        return personaRepository.save(persona);
    }

    public List<Persona> getPersonas() {
        return personaRepository.findAll(Sort.by("nombre"));
        /*List<Persona> personaDB = personaRepository.findAll(Sort.by("nombre"));
        return personaDB;*/
    }
}

