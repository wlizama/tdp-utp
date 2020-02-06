/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem03;

import java.util.Scanner;

/**
 *
 * Genere y muestre los N primeros números pares positivos pero en forma 
 * descendente, a excepción de los múltiplos de 5 y múltiplos de7.
 * @author wilder
 */
public class Ap01For01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar limite N: ");
        int lim = sc.nextInt();
        
        for (int i = lim; i > 0; i--) {
            if ((i % 2) == 0 &&
                (i % 5) != 0 &&
                (i % 7) != 0
                ) {
                System.out.println(i);
                
            }
        }
    }
}
