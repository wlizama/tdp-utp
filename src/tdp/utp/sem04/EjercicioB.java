/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem04;

import java.util.Scanner;

/**
 * Crea un programa en el que se pida por consola el nombre de 2 alumnos y la 
 * nota de cada uno de ellos como valor numérico. El resultado que debe 
 * mostrarse es el nombre de cada alumno, su nota como texto 
 * (Sobresaliente, Notable, Bien o Suspenso).
 * Crear un array numérico y otro de String
 * El programa debe comprobará la nota de cada alumno:
 *  Si la nota está entre 0 y 4,99 será un Suspenso.
 *  Si la nota está entre 5 y 6,99 será un Bien.
 *  Si la nota está entre 7 y 8,99 será un Notable.
 *  Si la nota está entre 189 y 20 será un Sobresaliente.
 * 
 * Muestra por pantalla, el alumno su nota y su resultado en palabras
 * @author LAB-USR-AQ265-A0106
 */
public class EjercicioB {
    public static void main(String[] args) {
        int cantAl = 2;
        int notas[] = new int[cantAl];
        String nombres[] = new String[cantAl];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cantAl; i++) {
            System.out.print("Ingrese nombre de alumno " + (i+1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Ingrese nota de alumno " + (i+1) + ": ");
            notas[i] = sc.nextInt();
        }
        
        for (int i = 0; i < cantAl; i++) {
            String nText = "";
            if (notas[i] >= 0 && notas[i] <= 4.99)
                nText = "Suspenso";
            if (notas[i] >= 5 && notas[i] <= 6.99)
                nText = "Bien";
            if (notas[i] >= 7 && notas[i] <= 8.99)
                nText = "Notable";
            if (notas[i] >= 9 && notas[i] <= 10)
                nText = "Sobresaliente";
            
            System.out.println("El alumno " + nombres[i] + " con nota " + notas[i] + " es: \"" + nText + "\"" );
        }
    }
}
