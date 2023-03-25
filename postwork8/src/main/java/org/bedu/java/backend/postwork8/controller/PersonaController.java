package org.bedu.java.backend.postwork8.controller;

import org.bedu.java.backend.postwork8.model.Persona;
import org.bedu.java.backend.postwork8.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    private final PersonaRepository personaRepository;
    @Autowired
    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @PostMapping
    public ResponseEntity<Void> creaPersona(@RequestBody Persona persona){

        Persona personaDB = personaRepository.save(persona);

        return ResponseEntity.created(URI.create(personaDB.getId().toString())).build();
    }

    @GetMapping
    public ResponseEntity<List<Persona>> getPersonas(){
        List<Persona> productosDB = personaRepository.findAll();
        return ResponseEntity.ok(productosDB);
    }

    @GetMapping("/{personaId}")
    public ResponseEntity<Persona> getPersona(@PathVariable Long personaId){
        Optional<Persona> personaDB = personaRepository.findById(personaId);
        System.out.println(personaDB.isPresent());
        if(!personaDB.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La persona NO existe!!!");
        }
        return ResponseEntity.ok(personaDB.get());
    }
}
