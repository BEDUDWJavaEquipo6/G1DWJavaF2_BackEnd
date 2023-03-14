package org.bedu.java.backend.postwork5.postwork5.service;

import org.springframework.stereotype.Service;

@Service
public class FormatearTel {
    public static String formatear(String telefono){
        return telefono.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "($1)-$2-$3");
    }
}
