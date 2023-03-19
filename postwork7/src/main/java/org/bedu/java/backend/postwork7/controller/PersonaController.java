package org.bedu.java.backend.postwork7.controller;
/*
Un servicio REST que al hacer una petición GET regrese la información de la agenda en formato JSON.
 */
import org.bedu.java.backend.postwork7.model.Persona;
import org.bedu.java.backend.postwork7.service.PhoneBookService;
//import org.bedu.java.backend.postwork7.Respository.PersonaRepository;
//Librerias para Sesion4 IoC
import org.springframework.beans.factory.annotation.Autowired;
//Librerias para Postwork5
import java.util.Set;
//Librerias para postwork6 RestAPI
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
//Librerias para portwotk7 thymeleaf
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class PersonaController {
    private PhoneBookService phoneBookService;

    @Autowired
    public PersonaController(PhoneBookService phoneBookService){
        this.phoneBookService= phoneBookService;

    }

    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model){
        model.addAttribute("persona", new Persona());
        return "index";
    }

    @GetMapping("/personas")
    public String listadoPersonas(Model model){
        model.addAttribute("personas", phoneBookService.readListaPhoneBook());
        return "personas";
    }

    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona, Errors errors) {

        String vistaResultado = "registroExitoso";

        if(errors.hasErrors()){
            vistaResultado = "index";
        }

        ModelAndView mav = new ModelAndView(vistaResultado);
        mav.addObject("persona", phoneBookService.addPersona(persona));
        return mav;
    }

}