package com.germangascon.ed.T5_Ejercicios.Metodos;
import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_01Test {
    @Test
    void testSignoPositivo() {
        // Camino: x > 0
        int resultado = Signo.signo(10);
        assertEquals(1, resultado, "Debe devolver 1 para números positivos");
    }

    @Test
    void testSignoNegativo() {
        // Camino: x < 0
        int resultado = Signo.signo(-5);
        assertEquals(-1, resultado, "Debe devolver -1 para números negativos");
    }

    @Test
    void testSignoCero() {
        // Camino: else (ni mayor ni menor a cero)
        int resultado = Signo.signo(0);
        assertEquals(0, resultado, "Debe devolver 0 cuando la entrada es cero");
    }

    @Test
    void testValorExtremoPositivo() {
        // Caso límite: El valor máximo de un entero
        assertEquals(1, Signo.signo(Integer.MAX_VALUE));
    }

    @Test
    void testValorExtremoNegativo() {
        // Caso límite: El valor mínimo de un entero
        assertEquals(-1, Signo.signo(Integer.MIN_VALUE));
    }

}