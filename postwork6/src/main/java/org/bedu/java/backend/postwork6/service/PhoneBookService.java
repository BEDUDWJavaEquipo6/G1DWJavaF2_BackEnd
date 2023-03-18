package org.bedu.java.backend.postwork6.service;

import org.bedu.java.backend.postwork6.model.Persona;
import org.bedu.java.backend.postwork6.repository.PersonaRepository;
import org.bedu.java.backend.postwork6.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PhoneBookService {
    private ValidaService validaService;
    private PersonaRepository personaRepository;

    private String telefono;

    @Autowired
    public PhoneBookService(ValidaService validaService, PersonaRepository personaRepository){
        this.validaService = validaService;
        this.personaRepository = personaRepository;
    }

    public Persona addPersona(Persona persona){
        if(validaService.Valida(persona.getTelefono())){
            telefono = ValidaService.Comprueba(persona.getTelefono());
            telefono = ValidaService.formatear(persona.getTelefono());

            persona.setTelefono(telefono);


        }else {
            System.out.println("Telefono no valido");
        }
        return personaRepository.addPersona(persona);
    }

    public Set<Persona> readListaPhoneBook(){

        return personaRepository.readListaPhoneBook();
    }

}
