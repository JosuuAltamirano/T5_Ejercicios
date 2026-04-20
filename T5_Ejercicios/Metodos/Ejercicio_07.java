package com.germangascon.ed.T5_Ejercicios.Metodos;

public class Ejercicio_07 {
    public static int evaluarPassword(String password){
        if (password == null) {
            return 0;
        }

        int puntos = 0;

        // Regla 1: Longitud
        if (password.length() >= 8) puntos++;

        // Regla 2: Mayúsculas
        if (password.matches(".*[A-Z].*")) puntos++;

        // Regla 3: Minúsculas
        if (password.matches(".*[a-z].*")) puntos++;

        // Regla 4: Números
        if (password.matches(".*[0-9].*")) puntos++;

        // Regla 5: Símbolos (cualquier cosa que no sea letra o número)
        if (password.matches(".*[^a-zA-Z0-9].*")) puntos++;
        return puntos;
    }

}
