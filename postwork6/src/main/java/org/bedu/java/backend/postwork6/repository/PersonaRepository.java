package org.bedu.java.backend.postwork6.repository;
/*
Almacene la información en memoria usando un Set de Java que ordene las entradas de forma
 alfabética por el nombre de la  persona. Para lograr esto Persona deberá implementar la
 interface java.lang.Comparable

 Metodos:
 addPersona to DB(lista_PhoneBook)
    add(new Persona persona to lista_persona)
 readPersonas from DB(lista_PhoneBook)
    -read/list/Personas  lista_PhoneBook
    -return lista Personas

 Opcional: read one Persona, para future GET by Id
 */

import org.springframework.stereotype.Repository;
import org.bedu.java.backend.postwork6.model.Persona;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

    //private static Set<Persona> phoneBook new Set<>();

    /*
    https://stackoverflow.com/questions/12314710/how-do-i-keep-a-hashset-alphabetically-ordered
    Note: duplicate objects are not allowed in TreeSet but allowed in TreeMap.


I would use a TreeSet which is a SortedSet. You need to define your custom class as Comparable based on the name and your collection will always be sorted.
     */

@Repository
public class PersonaRepository {

    private final Set<Persona> personas = new TreeSet<>();

    public Persona agregarPersona(Persona persona) {
        Long id = obtenerSiguienteId();
        persona.setId(id);
        personas.add(persona);
        return persona;
    }

    public Set<Persona> obtenerPersonas() {
        return Collections.unmodifiableSet(personas);
    }

    private Long obtenerSiguienteId() {
        Long id = 1L;
        if (!personas.isEmpty()) {
            id = Collections.max(personas).getId() + 1;
        }
        return id;
    }
}
