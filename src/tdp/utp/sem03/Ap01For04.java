/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem03;

import java.util.Scanner;

/**
 * btenga el factorial de los N primeros numeros
 * @author wilder
 */
public class Ap01For04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar limite N: ");
        int lim = sc.nextInt();
        double factorial = 1;
        for (int i = 0; i < lim; i++) {
            factorial *= (i+1);
        }
        
        System.out.println("Factorial de " + lim + " es: " + factorial);
    }
}
