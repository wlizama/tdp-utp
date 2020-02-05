/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem04;

import java.util.Scanner;

/**
 * Crea un array numérico con 5 elementos. Los números de cada elemento deben 
 * ser valores pedidos por teclado al usuario. Muestra por consola el índice y 
 * el valor al que corresponde. Debes utiliza bucles tanto para pedir los 
 * valores de los elementos del array como para mostrar su contenido por 
 * pantalla.
 * Ejemplo: Introducimos los valores 2, 4, 5, 8 y 10 .Lo que se tiene que 
 * mostrar por consola  sería:
 *  En el indice 0 esta el valor 2
 *  En el indice 1 esta el valor 4
 *  En el indice 2 esta el valor 5
 *  En el indice 3 esta el valor 8
 *  En el indice 4 esta el valor 10
 * @author LAB-USR-AQ265-A0106
 */
public class EjercicioC {
    public static void main(String[] args) {
        
        int len = 5;
        int nums[] = new int[len];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            System.out.print("El valor de la pocision [" + (i+1) + "]: ");
            nums[i] = sc.nextInt();
        }
        
        for (int i = 0; i < len; i++) {
            System.out.println("En el indice " + i + " esta el valor " + nums[i]);
        }
    }
}
