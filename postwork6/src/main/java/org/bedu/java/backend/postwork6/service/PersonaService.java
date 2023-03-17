import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    private Set<Persona> personas = new HashSet<>();

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public Set<Persona> getPersonas() {
        return personas;
    }
}
