package com.germangascon.ed.T5_Ejercicios.Metodos;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_06Test {

    @Test
    void testJugadaInvalidaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            PiedraPapelTijera.jugar("PIEDRA", "SPOCK");
        });
    }

    @Test
    void testEntradaNulaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            PiedraPapelTijera.jugar(null, "PAPEL");
        });
    }

    @Test
    void testEmpatePiedra() {
        assertEquals("EMPATE", PiedraPapelTijera.jugar("PIEDRA", "PIEDRA"));
    }

    // Usamos un test parametrizado para cubrir todas las combinaciones de victoria
    @ParameterizedTest
    @CsvSource({
            "PIEDRA, TIJERA, GANA J1",
            "TIJERA, PAPEL, GANA J1",
            "PAPEL, PIEDRA, GANA J1",
            "TIJERA, PIEDRA, GANA J2",
            "PAPEL, TIJERA, GANA J2",
            "PIEDRA, PAPEL, GANA J2"
    })
    void testCombinacionesVictoria(String j1, String j2, String esperado) {
        assertEquals(esperado, PiedraPapelTijera.jugar(j1, j2),
                "Fallo al enfrentar " + j1 + " contra " + j2);
    }

}