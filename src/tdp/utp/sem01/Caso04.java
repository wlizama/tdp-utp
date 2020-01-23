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
public class Caso04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String nombres1 = "", nombres2 = "", texto = "";
        double tenia = 0, gano = 0, total = 0;
        System.out.println("Ingrese sus nombres 1");
        nombres1 = scan.nextLine();
        System.out.println("Se llama " + nombres1);
        System.out.println("Ingres sus nombres 2");
        nombres2 = scan.next();
        scan.nextLine();
        System.out.println("Se llama " + nombres2);
        System.out.println("Cuanto dinero ten\u00eda?");
        tenia =scan.nextDouble();
        System.out.println("Cuanto dinero gan\u00f3?");
        gano = scan.nextDouble();
        total = tenia + gano;
        texto = "En su billetera hay S/" + total;
        System.out.println(texto);
    }
}
