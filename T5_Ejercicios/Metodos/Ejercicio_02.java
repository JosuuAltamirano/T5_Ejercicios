package com.germangascon.ed.T5_Ejercicios.Metodos;

public class Ejercicio_02 {

    public static String clasificarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad no válida");
        }
        if (edad < 6) {
            return "Infancia";
        } else if (edad < 12) {
            return "Niñez";
        } else if (edad < 18) {
            return "Adolescencia";
        } else if (edad < 25) {
            return "Juventud";
        } else if (edad < 60) {
            return "Adultez";
        } else {
            return "Vejez";
        }
    }

}

