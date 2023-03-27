package org.bedu.java.backend.postworkfinal.controller;

//Nuestras librerias
import org.bedu.java.backend.postworkfinal.model.Persona;
import org.bedu.java.backend.postworkfinal.service.AgendaService;
//Librerias para postwork6 RestAPI
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
//Librerias para portwotk7 thymeleaf
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class AgendaController {

    private final AgendaService agendaService;

    @Autowired
    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model){
        model.addAttribute("persona", new Persona());
        return "index";
    }

    @GetMapping("/personas")
    public String listadoPersonas(Model model){
        model.addAttribute("personas", agendaService.getPersonas());
        return "personas";
    }

    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona, Errors errors) {

        String vistaResultado = "registroExitoso";

        if(errors.hasErrors()){
            //System.out.println("hay errores");
            vistaResultado = "index";
            //System.out.println("hace la vista");
        }


        ModelAndView mav = new ModelAndView(vistaResultado);
        //System.out.println("crea el model and view");
        mav.addObject("persona", agendaService.guardaPersona(persona));
        //System.out.println("crea el obketo");
        return mav;
    }

/*    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona) {

        agendaService.guardaPersona(persona);

        ModelAndView mav = new ModelAndView("index");
        System.out.println("crea el model and view");
        mav.addObject("persona", agendaService.getPersonas());
        System.out.println("crea el obketo");
        return mav;
    }*/

}
