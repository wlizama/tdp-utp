/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem05;

import java.util.Scanner;

/**
 *
 * Cree un arreglo de 3 x 3. Ingrese números de 1 al 9 sin que se repitan. 
 * Haga un programa que pregunte un numero del 1 al 9 y muestre su 
 * posición en el arreglo. Obténgala buscándola en el arreglo
 * 
 * por solicitud del profesor los numeros se ingresan automaticamente de 1-9
 * @author LAB-USR-AQ265-A0106
 */
public class Ejer_a1 {
    public static void main(String[] args) {
        int col = 3, fil = 3;
        int [][] nums = new int[col][fil];
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fil; j++) {
//                System.out.print("Ingrese el número posicion[" + i + "," + j + "]: ");
                cont++;
                nums[i][j] = cont;
            }
        }
        
        System.out.print("Ingrese un número a buscar: ");
        int numb = sc.nextInt();
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fil; j++) {
                if (nums[i][j] == numb)
                    System.out.println("El número se encuentra en la posicion[" + i + "," + j + "]: ");
            }
        }
    }
}
