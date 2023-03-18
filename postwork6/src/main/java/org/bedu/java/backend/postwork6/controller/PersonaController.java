package org.bedu.java.backend.postwork6.controller;
/*
Un servicio REST que al hacer una petición GET regrese la información de la agenda en formato JSON.
 */
import org.bedu.java.backend.postwork6.model.Persona;
//import org.bedu.java.backend.postwork6.Respository.PersonaRepository;
import org.bedu.java.backend.postwork6.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/phonebook")
public class PersonaController {
    private PhoneBookService phoneBookService;

    @Autowired
    public PersonaController(PhoneBookService phoneBookService){
        this.phoneBookService= phoneBookService;

    }
    @PostMapping
    public ResponseEntity<Persona> postPersona(@RequestBody Persona persona) {
    //public String postPersona(@RequestBody Persona persona) {
        //llama PersonaRepository metodo addPersona(Persona persona)
        //addPersona(Persona persona)
        /*System.out.println("Creando usuario");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido" + persona.getApellido());
        System.out.println("Telefono" + persona.getTelefono());
        System.out.println("Id" + persona.getId());
        return "Usuario Creado";*/
        return ResponseEntity.status(HttpStatus.CREATED).body(phoneBookService.addPersona(persona));
    }

    /**
     * getPersonas
     * @return un JSON
     */


   @GetMapping
    public ResponseEntity<Set<Persona>> getPersonas() {
        //llama PersonaRepository metodo readListaPhoneBook()
        //listaPhoneBook=readListaPhoneBook()
        //for recorre elementos de la listaPhoneBook
        //genera variable = {
        // persona1:{key:valor ...key:valor},
        // persona2:{key:valor ...key:valor}.
        //                    ....,
        //                    ....,
        // personaN:{key:valor ...key:valor}
        //}
        return ResponseEntity.status(HttpStatus.CREATED).body(phoneBookService.readListaPhoneBook());
        //return variable;
    }

    /**
     *
     * @param persona
     * @param id
     * @return
     */
 /*   @PostMapping("/{id}")
    public String postPersonaId(@RequestBody Persona persona, @PathVariable("id") String id) {

        return "Modificaron datos de la PERsona con  Id";
    }

    /**
     * getPersonaId
     * @param id
     * @return
     */
/*    @GetMapping("/{id}")
    public String getPersonaId(@PathVariable("id") String id) {

        return "JSON de la Persona con Id";
    }

    /**
     * delPersonaId
     * @param id
     * @return
     */
  /*  @DelMapping("/{id}")
    public String delPersonaId(@PathVariable("id") String id) {

        return "Elimino la Persona con Id";
    }*/

}