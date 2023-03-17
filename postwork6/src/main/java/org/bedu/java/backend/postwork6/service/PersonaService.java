import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    private Set<Persona> personas = new TreeSet<>(Comparator.comparing(Persona::getName));

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public Set<Persona> getPersonas() {
        return personas;
    }
}
