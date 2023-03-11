package org.bedu.java.backend.postwork4.model.service;
import org.springframework.stereotype.Service;

import static java.util.Collections.replaceAll;
@Service
public class ValidarTel {

    //1. Valide que el numero solo contenga caracteres validos

    //2. Valide que el numero solo contenga 10 digitos

    //3. Elimine todos los caracteres que no sean numericos.

    //Mediante replaceAll buscamos cualquier valor que no sea 0-9 y se reemplaza.
    public String limpiarTel (String telefono){
        return telefono.replaceAll("[^0-9.]","");
    }


}
