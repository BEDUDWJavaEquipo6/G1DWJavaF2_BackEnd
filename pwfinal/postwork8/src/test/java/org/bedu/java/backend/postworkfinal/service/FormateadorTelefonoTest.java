package org.bedu.java.backend.postworkfinal.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FormateadorTelefonoTest {

    private FormateadorTelefono formateadorTelefono = new FormateadorTelefono();


    @Test
    @DisplayName("Prueba formateo telefono")
    void formatea() {
        String esperado = "(99)-9999-9999";
        assertEquals(esperado, formateadorTelefono.formatea("9999999999"));
    }
}