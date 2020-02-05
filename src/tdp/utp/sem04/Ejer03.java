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
public class Ejer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 4;
        int[] numeros = new int[len];
        double suma = 0, prom = 0;
        
        for (int i = 0; i < len; i++) {
            System.out.print("Ingresar numero en posicion [" + i + "]: ");
            numeros[i] = sc.nextInt();
        }
        
        int menor = numeros[0];
        int mayor = numeros[0];
        for (int i = 0; i < len; i++) {
            if (numeros[i] < menor)
                menor = numeros[i];
            
            if (numeros[i] > mayor)
                mayor = numeros[i];
        }
        
        for (int i = 0; i < len; i++)
            suma += numeros[i];
        
        prom = (suma-menor)/3;
        
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        System.out.println("Promedio 3 mayores: " + prom);
        
        // menor valor
        // mayor valor
        // promedio de las 3 mas altas
    }
}
