package org.bedu.java.backend.postwork6.controller;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.*;
import org.bedu.java.backend.postwork6.service.PersonaService;

@RestController
@RequestMapping("/v1/phonebook")
public class PersonaController {

    private final PhoneBookService phoneBookService;

    @Autowired
    public PersonaController(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @PostMapping("/persona")
    public ResponseEntity<?> agregarPersona(@RequestBody Persona persona) {
        Persona personaAgregada = phoneBookService.agregarPersona(persona);
        return new ResponseEntity<>(personaAgregada, HttpStatus.CREATED);
    }

    @GetMapping("/personas")
    public ResponseEntity<?> obtenerPersonas() {
        return new ResponseEntity<>(phoneBookService.obtenerPersonas(), HttpStatus.OK);
    }
    /*
    @GetMapping("/persona/{id}")
    public ResponseEntity<?> obtenerPersonaPorId(@PathVariable Long id) {
        Persona persona = phoneBookService.obtenerPersonaPorId(id);
        if (persona == null) {
            return new ResponseEntity<>("La persona con el id " + id + " no existe", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PutMapping("/persona/{id}")
    public ResponseEntity<?> actualizarPersona(@PathVariable Long id, @RequestBody Persona persona) {
        Persona personaActualizada = phoneBookService.actualizarPersona(id, persona);
        if (personaActualizada == null) {
            return new ResponseEntity<>("La persona con el id " + id + " no existe", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personaActualizada, HttpStatus.OK);
    }

    @DeleteMapping("/persona/{id}")
    public ResponseEntity<?> eliminarPersona(@PathVariable Long id) {
        Persona personaEliminada = phoneBookService.eliminarPersona(id);
        if (personaEliminada == null) {
            return new ResponseEntity<>("La persona con el id " + id + " no existe", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personaEliminada, HttpStatus.OK);
    }
    */
}
