/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactorizado;

/**
 *
 * @author irina
 */
public class CribaErastotenes { 

    public static int[] generarPrimos(int max) {
        if (max < 2) {
            return new int[0];                    //array vacio si max menos a 2 
        }

        boolean[] esPrimo = new boolean[max + 1]; //creo array de booleanos en falso
        int cuenta = 0;                            //cuento los numeros primos

        for (int i = 2; i <= max; i++) {
            if (!esPrimo[i]) {                     // i es primo
                cuenta++;
                for (int j = i * i; j <= max; j += i) { //guardo i como no primo
                    esPrimo[j] = true;
                }
            }
        }

        int[] primos = new int[cuenta]; //creo array de primos
        int index = 0;

        for (int i = 2; i <= max; i++) {
            if (!esPrimo[i]) {          //i es primo
                primos[index++] = i;
            }
        }

        return primos;
    }
}
