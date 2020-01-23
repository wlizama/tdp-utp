/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem02;

import java.util.Scanner;

/**
 * Ejercicio 02
 * @author wilder
 * En un casino de juegos se desea mostrar los mensajes respectivos por el 
 * puntaje obtenido en el lanzamiento de tres dados de un cliente, 
 * de acuerdo a los siguientes resultados:
    Si los tres dados son seis, mostrar el mensaje “Excelente”
    Si dos dados se obtiene seis, mostrar el mensaje “Muy bien”
    Si un dado se obtienen seis, mostrar el mensaje “Regular”
    Si ningún dado se obtiene seis, mostrar el mensaje “Pésimo”
 */
public class Dados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cuanto salió en primer dado? : ");
        int d1 = scan.nextInt();
        
        System.out.print("Cuanto salió en segundo dado? : ");
        int d2 = scan.nextInt();
        
        System.out.print("Cuanto salió en tercer dado? : ");
        int d3 = scan.nextInt();
        
        String resultado = (d1+d2+d3) == 18 ? "Excelente" : 
                ((((d1+d2+d3)-d3)==12 ||((d2+d3+d1)-d1)==12 || ((d3+d1+d2)-d2)==12)) ? "Muy bien" : 
                (d1+d2+d3)-(d2+d3) == 6 || (d1+d2+d3)-(d1+d3) == 6 || (d1+d2+d3)-(d1+d2) == 6 ? "Regular" : "Pésimo";
        
        System.out.println("El resultado es : " + resultado);
    }
}
