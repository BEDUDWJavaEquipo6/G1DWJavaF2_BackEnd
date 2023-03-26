package org.bedu.java.backend.postworkfinal.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorTelefonoTest {

    private ValidadorTelefono validadorTelefono = new ValidadorTelefono();

    @Test
    @DisplayName("Prueba para dejar solo números")
    void limpiaNumero() {
        String esperado = "9999999999";
        assertEquals(esperado, validadorTelefono.limpiaNumero("99-9999-9999"));
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {

        List<String> variosTelefonos = Arrays.asList(
                "99-9999-9999", "(99)-9999-9999", "999 999 9999","99 9999 9999", "999-999-9999");
        String esperado = "9999999999";

        return variosTelefonos.stream()
                .map(tel -> DynamicTest.dynamicTest("Telefonos: " + tel,
                        () -> {int id = variosTelefonos.indexOf(tel);

                            assertEquals(esperado, validadorTelefono.limpiaNumero(tel));
                        }));
    }
}