/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem01;

import java.util.Scanner;

/**
 *
 * Escriba programa para ingresar 4 notas de un alumno, 
 * calcular y mostrar su promedio, sabiendo que la 1ra 
 * y 2da tiene 20% de peso cada una, la 3ra y 4ta tienen 30% de peso cada una.
 */
public class NotasAlumno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba nota 01: ");
        double n01 = scan.nextDouble();
        System.out.print("Escriba nota 02: ");
        double n02 = scan.nextDouble();
        System.out.print("Escriba nota 03: ");
        double n03 = scan.nextDouble();
        System.out.print("Escriba nota 04: ");
        double n04 = scan.nextDouble();
        
        double promedio = (n01*0.2) + (n02*0.2) + (n03*0.3) + (n04*0.3);
        
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
