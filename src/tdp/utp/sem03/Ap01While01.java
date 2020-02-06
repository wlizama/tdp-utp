/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem03;

import java.util.Scanner;

/**
 * Hacer un programa que calcule el sueldo mensual de N empleados de una 
 * empresa. Se ingresa el nombre, numero de días trabajados, faltas por cada 
 * empleado. 
 * También se pide el monto total de sueldos de todos los empleados.
 * El número de empleados que ganan entre 2500 y 3500.
 * El número de empleados que ganan menos de 1000 o más de 4000.
 * 
 * Considere constante el pago por día a cada empleado y que el descuento por 
 * día de falta es de 100% del pago diario.
 * @author wilder
 */
public class Ap01While01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos empleados resgistrara? ");
        int nempl = sc.nextInt();
        int cont = 0;
        double pago_x_dia = 80;
        double suma_sueldo_mes = 0;
        int nempl4 = 0, nempl25y35 = 0, nempl1 = 0;
        
        while (cont < nempl) {
            cont ++;
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = sc.next();
            System.out.print("Ingrese el número de días laborados: ");
            int dias_laborados = sc.nextInt();
            System.out.print("Ingrese el número de faltas: ");
            int faltas = sc.nextInt();

            double sueldo_mes = (dias_laborados * pago_x_dia) - (faltas * pago_x_dia);
            suma_sueldo_mes += sueldo_mes;
            
            if (sueldo_mes < 1000)
                nempl1 ++;
            else if (sueldo_mes >= 2500 && sueldo_mes <= 3500)
                nempl25y35++;
            else if (sueldo_mes > 4000)
                nempl4++;
            
            System.out.println("a " + nombre + " le toca un pago mensual de: " + sueldo_mes);
            System.out.println("---------------------------------------");
        }
        
        System.out.println("Monto total de sueldos: " + suma_sueldo_mes);
        System.out.println("Nro. empleados que ganan < 1000: " + nempl1);
        System.out.println("Nro. empleados que ganan 2500 y 3500: " + nempl25y35);
        System.out.println("Nro. empleados que ganan > 4000: " + nempl4);
        
    }
 
}
