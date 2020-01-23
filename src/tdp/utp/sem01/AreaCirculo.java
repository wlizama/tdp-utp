/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem01;

import java.util.Scanner;

/**
 * En base al ejemplo, escriba un programa para hallar el área de un círculo.
 */
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba el radio del circulo: ");
        double radio = scan.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio: " + radio + " es: " + area);
    }
}
