/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem04;

import java.util.Scanner;

/**
 * Cree un arreglo de 12 posiciones. Ingrese en el código los nombres de los 
 * meses del año en él. Haga un programa que pregunte un numero de mes y 
 * muestre en pantalla su descripción. Obténgala del arreglo
 * @author LAB-USR-AQ265-A0106
 */
public class EjercicioA {
    public static void main(String[] args) {
        
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el número de mes: ");
        int nmes = sc.nextInt();
        System.out.println("El mes es: " + meses[nmes-1]);
    }
}
