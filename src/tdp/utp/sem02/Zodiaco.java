/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem02;

import java.util.Scanner;

/**
 * Ejercicio 3
 * @author wilder
 * Desarrolle un programa que permita el ingreso de la fecha de su onomástico 
 * (Día y Mes) y que muestre un mensaje que indique el signo zodiacal al que 
 * pertenece. Considere solo se pueda ingresar la cantidad de meses y días
 * según calendario.
 * 
    Aries        MAR 21 - ABR 19
    Tauro        ABR 20 - MAY 20
    Géminis      MAY 21 - JUN 20
    Cancer       JUN 21 - JUL 22
    Leo          JUL 23 - AGO 22
    Virgo        AGO 23 - SEP 22
    Libra        SEP 23 - OCT 22
    Escorpio     OCT 23 - NOV 21
    Sagitario    NOV 22 - DIC 21
    Capricornio  DIC 22 - ENE 19
    Acuario      ENE 20 - FEB 18
    Piscis       FEB 19 - MAR 20
 */
public class Zodiaco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Que día naciste?: ");
        int dia = scan.nextInt();
        
        System.out.print("Que mes naciste?: ");
        int mes = scan.nextInt();
        
        String signo = "";
//        switch(mes) {
//            case 3:
//                if(dia > 20) signo = "Aries";
//                break;
//            case 4:
//                if(dia > 19) signo = "Tauro";
//                break;
//            case 5:
//                if(dia > 20) signo = "Géminis";
//                break;
//        }
        
        System.out.print("Tu signo es: " + signo);
    }
}
