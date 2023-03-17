package org.bedu.java.backend.postwork6.controller;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.bedu.java.backend.postwork6.service.PersonaService;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/personas")
    public ResponseEntity<String> agregarPersona(@RequestBody Persona persona) {
        personaService.agregarPersona(persona);
        return new ResponseEntity<>("Persona agregada correctamente", HttpStatus.CREATED);
    }


    @GetMapping("/personas")
    public ResponseEntity<List<Persona>> obtenerPersonas() {
        List<Persona> listaPersonas = personaService.obtenerPersonas();
        return new ResponseEntity<>(listaPersonas, HttpStatus.OK);
    }

}
