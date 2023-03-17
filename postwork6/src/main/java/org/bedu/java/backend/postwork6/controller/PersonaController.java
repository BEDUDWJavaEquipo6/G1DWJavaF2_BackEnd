package org.bedu.java.backend.postwork6.controller;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/personas")
    public ResponseEntity<String> addPersona(@RequestBody Persona persona) {
        personaService.addPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/personas")
    public Set<Persona> getPersonas() {
        return personaService.getPersonas();
    }
}
