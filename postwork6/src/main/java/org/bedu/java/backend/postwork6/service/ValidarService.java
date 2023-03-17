package org.bedu.java.backend.postwork6.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidarService {

    public boolean validarTelefono(String telefono) {
        // implementación de la validación del teléfono
        // en este caso solo verificamos si tiene un formato correcto (###-###-####)
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher(telefono);
        return matcher.matches();
    }
}
