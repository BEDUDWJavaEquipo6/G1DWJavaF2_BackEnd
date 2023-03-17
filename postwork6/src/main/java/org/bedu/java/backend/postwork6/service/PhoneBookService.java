package org.bedu.java.backend.postwork6.service;

import org.bedu.java.backend.postwork6.model.Persona;
import org.bedu.java.backend.postwork6.repository.PhoneBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneBookService {
    private ValidaService validaService;
    private PhoneBook phoneBook;

    private String telefono;

    @Autowired
    public PhoneBookService(ValidaService validaService, PhoneBook phoneBook){
        this.validaService = validaService;
        this.phoneBook = phoneBook;
    }

    public Persona addPersona(Persona persona){
        if(validaService.Valida(persona.getTelefono())){
            telefono = ValidaService.Comprueba(persona.getTelefono());
            telefono = ValidaService.formatear(persona.getTelefono());

            persona.setTelefono(telefono);


        }else {
            System.out.println("Telefono no valido";
        }
        return phoneBook.addPersona(persona);
    }

}
