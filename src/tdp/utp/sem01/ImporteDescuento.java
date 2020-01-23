/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem01;

import java.util.Scanner;

/**
 *
 * Desarrolle un programa que permita calcular el importe de descuento de acuerdo a lo siguiente:  
 * Importe de descuento = 5% del importe de compra
 */
public class ImporteDescuento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el importe de compra: ");
        double impcomp = scan.nextDouble();
        double impdescuento = impcomp * 0.05;
        System.out.println("El importe de desuento es de: " + impdescuento);
    }
}
