package com.germangascon.ed.T5_Ejercicios.Metodos;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_05Test {
    @Test
    void testDivisiblePor4NoPor100() {
        // TC01: Caso estándar de año bisiesto
        assertTrue(EsBisiesto.esBisiesto(2024), "2024 debería ser bisiesto (divisible por 4)");
    }

    @Test
    void testDivisiblePor100NoPor400() {
        // TC02: Caso crítico de año centenario NO bisiesto
        assertFalse(EsBisiesto.esBisiesto(2100), "2100 NO debería ser bisiesto");
    }

    @Test
    void testDivisiblePor400() {
        // TC03: Excepción de los centenarios que SÍ son bisiestos
        assertTrue(EsBisiesto.esBisiesto(2000), "2000 debería ser bisiesto (divisible por 400)");
    }

    @Test
    void testNoDivisiblePor4() {
        // TC04: Caso de año común
        assertFalse(EsBisiesto.esBisiesto(2023), "2023 no es bisiesto");
    }

    @Test
    void testValorCero() {
        // Caso límite extra: el año 0 se considera bisiesto en el calendario gregoriano proliptico
        assertTrue(EsBisiesto.esBisiesto(0));
    }

}