/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem04;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AQ265-A0106
 */
public class Ejer02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int len = 4;
        int[] numeros = new int[len];
        double suma = 0, prom = 0;
        
        System.out.print("Ingresar número 1:");
        numeros[0] = sc.nextInt();
        
        System.out.print("Ingresar número 2:");
        numeros[1] = sc.nextInt();
        
        System.out.print("Ingresar número 3:");
        numeros[2] = sc.nextInt();
        
        System.out.print("Ingresar número 4:");
        numeros[3] = sc.nextInt();
        
        suma += numeros[0];
        suma += numeros[1];
        suma += numeros[2];
        suma += numeros[3];
        
        prom = suma / len;
        
        System.out.println("El promedio es: " + prom);
    }
}
