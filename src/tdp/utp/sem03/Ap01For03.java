/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem03;

import java.util.Scanner;

/**
 * Imprima y sume 75 términos de la serie:
 *     2/3, 5/5, 8/7, 11/9, ...
 * @author wilder
 */
public class Ap01For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = 75;
        int numerador = 2;
        int denominador = 3;
        int numerador_incr = 3;
        int denominador_incr = 2;
        double suma = 0;
        
        for (int i = 0; i < lim; i++) {
            System.out.println(numerador + "/" + denominador);
            suma += numerador/denominador;
            numerador += numerador_incr;
            denominador += denominador_incr;
        }
        System.out.println("La suma de la serie es: " + suma);
    }
    
}
