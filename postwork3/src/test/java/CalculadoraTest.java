import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @TestFactory
    Stream<DynamicTest> dynamicTestsIntStream() {
        return IntStream.iterate(0, n -> n + 1).limit(5)
                .mapToObj(n -> dynamicTest("Suma" + n,
                        () -> assertEquals(n+(n + 1),calculadora.suma(n,n+1))));
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {


        Calculadora calculadora = new Calculadora();
        List<Integer> entradas = IntStream.range(0, 1000).boxed().collect(Collectors.toList());
        List<Integer> resultados = IntStream.range(0, 1000).map(n -> n * 2).boxed().collect(Collectors.toList());

        return entradas.stream()
                .map(numero -> DynamicTest.dynamicTest("multiplicando: " + numero,
                        () -> {
                            assertEquals(calculadora.multi(numero, 2), resultados.get(numero));
                        }));
    }


}