package org.bedu.java.backend.postwork6.service;

import org.springframework.stereotype.Service;
import org.bedu.java.backend.postwork6.repository.PersonaRepository;
import org.bedu.java.backend.postwork6.service.ValidarService;
import org.bedu.java.backend.postwork6.model.Persona;
@Service
public class PhoneBookService {

    private final PersonaRepository personaRepository;
    private final ValidarService validarService;

    public PhoneBookService(PersonaRepository personaRepository, ValidarService validarService) {
        this.personaRepository = personaRepository;
        this.validarService = validarService;
    }

    public void agregarPersona(Persona persona) throws InvalidPhoneFormatException {
        String telefonoValidado = validarService.validarTelefono(persona.getTelefono());
        Persona personaValidada = new Persona(persona.getNombre(), telefonoValidado);
        personaRepository.agregarPersona(personaValidada);
    }

    public List<Persona> obtenerPersonas() {
        return personaRepository.obtenerPersonas();
    }
}
