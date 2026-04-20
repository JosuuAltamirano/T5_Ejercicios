package com.germangascon.ed.T5_Ejercicios.Metodos;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_03Test {
    @Test
    void testArrayVacio() {
        // Un array sin elementos debe devolver 0
        int[] datos = {};
        assertEquals(0, ContarPositivos.contarPositivos(datos),
                "Un array vacío no debería tener positivos");
    }

    @Test
    void testTodosNegativosYCero() {
        // El cero no es positivo (> 0), por lo que el resultado debe ser 0
        int[] datos = {-1, -5, 0, -10};
        assertEquals(0, ContarPositivos.contarPositivos(datos),
                "No debería contar negativos ni el número cero");
    }

    @Test
    void testMezclaDeValores() {
        // Caso normal con mezcla de tipos de números
        int[] datos = {10, -2, 0, 5, -1, 1};
        // Positivos: 10, 5, 1 (Total: 3)
        assertEquals(3, ContarPositivos.contarPositivos(datos),
                "Debería contar exactamente 3 números positivos");
    }

    @Test
    void testTodosPositivos() {
        // Caso donde todos los elementos cumplen la condición
        int[] datos = {1, 2, 3};
        assertEquals(3, ContarPositivos.contarPositivos(datos));
    }

    @Test
    void testUnSoloElementoPositivo() {
        // Caso límite: array de tamaño 1
        int[] datos = {1};
        assertEquals(1, ContarPositivos.contarPositivos(datos));
    }
}