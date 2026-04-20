package com.germangascon.ed.T5_Ejercicios.Metodos;

public class Ejercicio_06 {
    public static String jugar(String jugador1, String jugador2){

        if (jugador1 == null || jugador2 == null) {
            throw new IllegalArgumentException("Jugada no válida");
        }

        String j1 = jugador1.toUpperCase();
        String j2 = jugador2.toUpperCase();

        if (!j1.matches("PIEDRA|PAPEL|TIJERA") || !j2.matches("PIEDRA|PAPEL|TIJERA")) {
            throw new IllegalArgumentException("Jugada no válida");
        }

        // 2. Lógica de empate
        if (j1.equals(j2)) {
            return "EMPATE";
        }

        // 3. Lógica de victoria
        if ((j1.equals("PIEDRA") && j2.equals("TIJERA")) ||
                (j1.equals("TIJERA") && j2.equals("PAPEL")) ||
                (j1.equals("PAPEL") && j2.equals("PIEDRA"))) {
            return "GANA J1";
        }

        return "GANA J2";
    }
}
