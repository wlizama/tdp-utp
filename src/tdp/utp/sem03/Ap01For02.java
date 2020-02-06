package tdp.utp.sem03;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Genere y muestre los N primeros múltiplos de 6 en forma ascendente, a 
 * excepción de los múltiplos de 5
 * @author wilder
 */
public class Ap01For02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar limite N: ");
        int lim = sc.nextInt();
        
        for (int i = 0; i < lim; i++) {
            if ((i % 6) == 0 &&
                (i % 5) != 0) {
                System.out.println(i);
            }
                
        }
    }
}
