package org.bedu.java.backend.postwork6.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidaService {


    public boolean Valida(String telefono){
//
        return Pattern.compile("^[1-9]\\d{2} \\d{3} \\d{4}").matcher(telefono).matches()
                || Pattern.compile("^[1-9]\\d{2}-\\d{3}-\\d{4}").matcher(telefono).matches();
    }

    public static String Comprueba(String telefono){
        return telefono.replaceAll("[^0-9.]","");
    }
}
