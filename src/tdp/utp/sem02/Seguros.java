/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem02;

import java.util.Scanner;

/**
 *
 * @author wilder
 */
public class Seguros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Que tipo de seguro elige?: ");
        String tiposeg = scan.next();
        
        System.out.print("A cuantas personas desea afiliar?: ");
        int cantafil = scan.nextInt();
        
        int maxper = 0;
        double pagomen = 0;

        int maxper_exc = 0;
        double pagomen_exc = 0;
        
        switch(tiposeg.toUpperCase()) {
            case "A":
                maxper = 8;
                pagomen  = 40;
                pagomen_exc = 8;
                break;
            case "B":
                maxper = 6;
                pagomen  = 30;
                pagomen_exc = 8;
                break;
            case "C":
                maxper = 4;
                pagomen  = 20;
                pagomen_exc = 5;
                break;
            case "D":
                maxper = 2;
                pagomen  = 10;
                pagomen_exc = 5;
                break;
            default:
                break;
        }
        
        maxper_exc = cantafil - maxper;
        double montopagoexc = (maxper_exc * pagomen_exc);
        
        System.out.println("Por el seguro \"" + tiposeg.toUpperCase() + "\" debe pagar al año: " + (pagomen + montopagoexc) * 12);
    }
}
