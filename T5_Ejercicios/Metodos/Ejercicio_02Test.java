package com.germangascon.ed.T5_Ejercicios.Metodos;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_02Test {
    @Test
    void testEdadNegativaLanzaExcepcion() {
        // Verificamos que al introducir -1 se lance la excepción correcta
        assertThrows(IllegalArgumentException.class, () -> {
            ClasificarEdad.clasificarEdad(-1);
        });
    }

    @Test
    void testLimitesInfancia() {
        // Probamos el valor mínimo posible y un valor intermedio del primer rango
        assertEquals("Infancia", ClasificarEdad.clasificarEdad(0));
        assertEquals("Infancia", ClasificarEdad.clasificarEdad(5));
    }

    @Test
    void testLimitesNinez() {
        // 6 es el primer valor de Niñez, 11 es el último
        assertEquals("Niñez", ClasificarEdad.clasificarEdad(6));
        assertEquals("Niñez", ClasificarEdad.clasificarEdad(11));
    }

    @Test
    void testLimitesAdolescencia() {
        assertEquals("Adolescencia", ClasificarEdad.clasificarEdad(12));
        assertEquals("Adolescencia", ClasificarEdad.clasificarEdad(17));
    }

    @Test
    void testLimitesJuventud() {
        assertEquals("Juventud", ClasificarEdad.clasificarEdad(18));
        assertEquals("Juventud", ClasificarEdad.clasificarEdad(24));
    }

    @Test
    void testLimitesAdultez() {
        assertEquals("Adultez", ClasificarEdad.clasificarEdad(25));
        assertEquals("Adultez", ClasificarEdad.clasificarEdad(59));
    }

    @Test
    void testLimiteVejez() {
        // A partir de 60 inclusive
        assertEquals("Vejez", ClasificarEdad.clasificarEdad(60));
        assertEquals("Vejez", ClasificarEdad.clasificarEdad(100));
    }
}