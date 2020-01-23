/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem01;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AQ265-A0106
 */
public class Caso03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa tu Nombre: ");
        String nombre = scan.next();
        System.out.print("Ingresa tu apellido Paterno: ");
        String apP = scan.next();
        System.out.print("Ingresa tu apellido Materno: ");
        String apM = scan.next();
        System.out.print("Ingresa tu edad: ");
        int ed = scan.nextInt();
        System.out.print("Cuanto ganas?: ");
        double suel = scan.nextDouble();
        System.out.println("**********************************");
        System.out.println("Tu nombre es: " + nombre + " " + apP + " " + apM 
                + "\ntienes: " + ed + " años"
                + "\ny ganas: " + suel + " soles"
        );
        System.out.println("**********************************");
    }
}
