/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem02;

import java.util.Scanner;

/**
 * Ejercicio 01
 * @author wilder
 * En una tienda se ha establecido la siguiente oferta: por compras menores a 
 * 50 soles se hace un descuento de 8%, pero para compras a partir de 50 el 
 * descuento es de 10%. Se pide ingresar la cantidad y el precio del producto 
 * que se compra y determinar cuanto se descontará y cuanto se cobrará.
 */
public class TiendaDescuento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba monto de compra: ");
        double monto_compra = scan.nextDouble();
        
        System.out.print("Escriba la cantidad de compra: ");
        double cant_compra = scan.nextDouble();
        
        double desc = 0;
        double monto_bruto = monto_compra * cant_compra;
        
        if (monto_bruto < 50)
            desc = 0.08;
        else
            desc = 0.10;
        
        double monto_a_desc = monto_bruto * desc;
        double monto_neto = monto_bruto - monto_a_desc;
        
        System.out.println("El monto bruto es: " + monto_bruto);
        System.out.println("Por la compra tiene descuento de " + (desc*100) + "% que es: " + monto_a_desc);
        System.out.println("El monto neto es: " + monto_neto);
    }
}
