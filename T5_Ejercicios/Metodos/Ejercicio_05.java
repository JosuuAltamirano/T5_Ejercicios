package com.germangascon.ed.T5_Ejercicios.Metodos;

public class Ejercicio_05 {
    public static boolean esBisiesto(int anyo){
        return (anyo % 4 == 0 && anyo % 100 !=0) || (anyo % 400 == 0);
    }
}
