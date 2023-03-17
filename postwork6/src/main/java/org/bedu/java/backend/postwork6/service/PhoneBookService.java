package org.bedu.java.backend.postwork6.service;
import java.util.Set;
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

    public void agregarPersona(String nombre, String apellido, String telefono) throws TelefonoInvalidoException {
        if (!validarService.validarTelefono(telefono)) {
            throw new TelefonoInvalidoException("El formato del teléfono no es válido");
        }
        Long id = personaRepository.obtenerSiguienteId();
        Persona persona = new Persona(id, nombre, apellido, telefono);
        personaRepository.agregarPersona(persona);
    }

    public Set<Persona> obtenerPersonas() {
        return personaRepository.obtenerPersonas();
    }

}
