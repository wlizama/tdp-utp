/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem01;

import java.util.Scanner;

/**
 *
 * Desarrolle un programa que pida cuantos hombres y mujeres hay 
 * en un aula y permita calcular el porcentaje de hombres y mujeres.
 */
public class PorcHombresMujeres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese cuantos hombres tiene el aula: ");
        int chombres = scan.nextInt();
        
        System.out.print("Ingrese cuantas mujeres tiene el aula: ");
        int cmujeres = scan.nextInt();
        
        int totalhm = chombres + cmujeres;
        double phombres = (chombres * 100 ) / totalhm;
        double pmujeres = 100 - phombres;
        
        System.out.println("El porcetaje de hombres es: " + phombres + "%");
        System.out.println("El porcetaje de mujeres es: " + pmujeres + "%");
    }
}
