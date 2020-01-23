/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem02;

import java.util.Scanner;

/**
 * Caso practico 02
 * @author wilder
 * Construir un programa que simule el funcionamiento de una calculadora que 
 * pueda realizar las cuatro operaciones aritméticas básicas (suma, resta, 
 * producto y división) al ingresar 2 números enteros. 
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba primer número: ");
        int n01 = scan.nextInt();
        
        System.out.print("Escriba segundo número: ");
        int n02 = scan.nextInt();
        
        System.out.println("Que operación desea realizar?");
        System.out.println("[S]uma\n[R]esta\n[M]ultiplicación\n[D]ivisión");
        String ope = scan.next();
        
        double result = 0;
        String chr_ope = "";
        
        switch(ope.toUpperCase()) {
            case "S":
                result = n01 + n02;
                chr_ope = "+";
                break;
            case "R":
                result = n01 - n02;
                chr_ope = "-";
                break;
            case "M":
                result = n01 * n02;
                chr_ope = "*";
                break;
            case "D":
                result = n01 / n02;
                chr_ope = "/";
                break;
            default:
                break;
        }
        System.out.println("El resultado de " + n01 + " " + chr_ope + " " + n02 + " = " + result);
    }
}
