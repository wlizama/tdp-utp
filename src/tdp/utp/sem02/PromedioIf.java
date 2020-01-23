/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem02;

import java.util.Scanner;

/**
 * Caso practico 01
 * @author wilder
 * Hacer un programa en java que permita ingresar tres notas para un alumno, la 
 * nota A que tiene una importancia de 3 créditos, la nota B tiene 4 Créditos, y
 * la nota C tiene sólo 2 créditos; se debe de calcular el promedio teniendo en 
 * cuenta las notas y al final si el alumno tiene un promedio igual o mayor 
 * a 10.5 mostrar “Aprobado”, en caso contrario “Desaprobado”.
 */
public class PromedioIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba nota A: ");
        double n01 = scan.nextDouble();
        int n01_cred = 3;
        
        System.out.print("Escriba nota B: ");
        double n02 = scan.nextDouble();
        int n02_cred = 4;
        
        System.out.print("Escriba nota C: ");
        double n03 = scan.nextDouble();
        int n03_cred = 2;
        
        double sum_cred = n01_cred + n02_cred + n03_cred;
        double prom = ((n01*n01_cred) + (n02*n02_cred) +(n03*n03_cred)) / sum_cred;
        
        System.out.println("El promedio es: " + prom);
        
        
        if (prom >= 10.5) 
            System.out.println("El curso esta APROBADO");
        else
            System.out.println("El curso esta DESAPROBADO");
    }
}
