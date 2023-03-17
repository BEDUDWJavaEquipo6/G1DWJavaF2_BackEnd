package org.bedu.java.backend.postwork6.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidarService {

    private static final String TELEFONO_REGEX = "\\d{10}";

    public String validarTelefono(String telefono) throws InvalidPhoneFormatException {
        if (!telefono.matches(TELEFONO_REGEX)) {
            throw new InvalidPhoneFormatException("El formato del teléfono es inválido");
        }
        return telefono.replaceAll("(\\d{2})(\\d{4})(\\d{4})", "($1)-$2-$3");
    }
}
