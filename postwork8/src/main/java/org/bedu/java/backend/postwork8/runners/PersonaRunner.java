/*
Reto2 Aplicado Deshabilitado para hacer carga pro sql Script
package org.bedu.java.backend.postwork8.runners;

import org.bedu.java.backend.postwork8.model.Persona;
import org.bedu.java.backend.postwork8.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PersonaRunner implements CommandLineRunner {

        private final PersonaRepository personaRepository;
        private static final boolean createTablaPersona = false;

        @Autowired
        public PersonaRunner(PersonaRepository personaRepository) {
            this.personaRepository = personaRepository;
        }

        @Override
        public void run(String... args) throws Exception {
            Persona persona1 = creaPersona("Jerri", "Maciejak", "(34)-0120-2480", 92);
            Persona persona2 = creaPersona("Benetta", "Haskins", "(36)-4831-5870", 71);
            Persona persona3 = creaPersona("Corty", "Bassick", "(39)-5710-3018", 44);
            Persona persona4 = creaPersona("Odo", "Biddwell", "(96)-4887-5734", 54);
            Persona persona5 = creaPersona("Candie", "Jakubovski", "(06)-8984-9316", 46);
            Persona persona6 = creaPersona("Nara", "Joiris", "(32)-9482-7013", 91);

            
            List<Persona> personas = Arrays.asList(persona1, persona2, persona3, persona4, persona5, persona6);

            try {
                if (createTablaPersona) {
                    personaRepository.saveAll(personas);
                }
            } catch (Exception e){
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Tabla Personas ya habia sido creada!!!");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
            }

        }

    private Persona creaPersona(String nombre, String apellido, String telefono, Integer edad){
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setTelefono(telefono);
        persona.setEdad(edad);
        return persona;
    }
}
*/