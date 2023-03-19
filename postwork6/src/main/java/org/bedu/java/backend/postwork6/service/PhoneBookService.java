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
            System.out.println("Obj Persona capturado: "+persona);
            persona.setTelefono(ValidaService.Comprueba(persona.getTelefono()));
            System.out.println("Ejecutando limpieza del teléfono metodo Comprueba(): "+persona.getTelefono());
            persona.setTelefono(ValidaService.formatear(persona.getTelefono()));
            System.out.println("Dando formato al teléfono con metodo formatear(): "+persona.getTelefono());
            return personaRepository.addPersona(persona);
        }else {
            System.out.println("Telefono no valido");
            // AQUI VA UNA LINEA DE ERROR no se cual pero algo
            return persona ;
        }
        //return personaRepository.addPersona(persona);
    }

    public Set<Persona> readListaPhoneBook(){

        return personaRepository.readListaPhoneBook();
    }

}
