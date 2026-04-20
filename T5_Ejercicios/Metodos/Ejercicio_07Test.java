package com.germangascon.ed.T5_Ejercicios.Metodos;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_07Test {
    @Test
    void testPasswordNuloRetornaCero() {
        assertEquals(0, Password.evaluarPassword(null),
                "Un password nulo no debería sumar puntos");
    }

    @ParameterizedTest
    @CsvSource({
            "'abc', 1, 'Solo minúsculas'",
            "'12345678', 2, 'Longitud y números'",
            "'Abc123', 3, 'Mayús, Minús y Números'",
            "'Abc12345', 4, 'Longitud, Mayús, Minús y Números'",
            "'Admin.2026', 5, 'Todos los criterios (Fuerte)'"
    })
    void testPuntuacionPassword(String password, int esperado, String descripcion) {
        assertEquals(esperado, Password.evaluarPassword(password),
                "Fallo en caso: " + descripcion);
    }

    @Test
    void testPasswordSoloSimbolos() {
        // Verificamos específicamente la regla de símbolos
        assertEquals(1, Password.evaluarPassword("!@#$%"),
                "Debería detectar solo símbolos");
    }

    @Test
    void testPasswordEspacios() {
        // Un espacio cuenta como símbolo y como longitud
        // " " -> 1 punto (símbolo)
        // "        " (8 espacios) -> 2 puntos (longitud + símbolo)
        assertEquals(2, Password.evaluarPassword("        "));
    }

}