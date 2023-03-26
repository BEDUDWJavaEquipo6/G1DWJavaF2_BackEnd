package org.bedu.java.backend.postworkfinal.service;

import org.bedu.java.backend.postworkfinal.model.Persona;
import org.bedu.java.backend.postworkfinal.persistence.PersonaRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AgendaServiceTest {

    Persona pruebaPersona = new Persona(22L,"fulanito", "0123456789");
    Persona pruebaPersona2;

    @Mock
    PersonaRepository personaRepository;

    @Mock
    ValidadorTelefono validadorTelefono;

    @InjectMocks
    AgendaService agendaService;


    @Test
    void guardaPersona()
    {
        agendaService.guardaPersona(pruebaPersona);
        verify(personaRepository).save(pruebaPersona);
    }

    @Test
    void guardaPersona2() {

        when(personaRepository.save(pruebaPersona)).thenReturn(pruebaPersona);

        assertEquals(pruebaPersona, personaRepository.save(pruebaPersona));

       // verify(calcService).add(20.0, 30.0);
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsAgendaService() {
        List<Persona> inputList = Arrays.asList(
                new Persona(15L,"fulanito","1234567890"), new Persona(16L,"pereganito","0123456789"), new Persona(17L,"sutanito","9999999999"));

        Stream<DynamicTest> savePersona = inputList.stream()
                .map(per -> DynamicTest.dynamicTest(
                        "guarda Persona: " + per.toString(),
                        () -> {
                            Persona personaDB = agendaService.guardaPersona(per);
                            assertEquals(personaDB.getNombre(), per.getNombre());
                        }
                ));
        return savePersona;
    }



    @Test
    void getPersonas() {
        agendaService.getPersonas();
        verify(personaRepository).findAll(Sort.by("nombre"));
    }

}