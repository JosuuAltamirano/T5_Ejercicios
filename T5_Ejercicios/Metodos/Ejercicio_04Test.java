package com.germangascon.ed.T5_Ejercicios.Metodos;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_04Test {
    @ParameterizedTest
    @ValueSource(ints = {-1, 11, 100})
    void testNotasInvalidasLanzanExcepcion(int notaInvalida) {
        assertThrows(IllegalArgumentException.class, () -> {
            Calificacion.calificacion(notaInvalida);
        });
    }

    // 2. Test Parametrizado para todas las ramas del Switch
    @ParameterizedTest
    @CsvSource({
            "0,  SUSPENSO",
            "4,  SUSPENSO",
            "5,  SUFICIENTE",
            "6,  BIEN",
            "7,  NOTABLE",
            "8,  NOTABLE",
            "9,  SOBRESALIENTE",
            "10, SOBRESALIENTE"
    })
    void testCalificacionesCorrectas(int nota, String esperado) {
        assertEquals(esperado, Calificacion.calificacion(nota),
                "La nota " + nota + " debería ser " + esperado);
    }

    // 3. Test de seguridad adicional (Opcional pero recomendado)
    @Test
    void testNoLanzaExcepcionConNotasValidas() {
        assertDoesNotThrow(() -> Calificacion.calificacion(5));
    }

}