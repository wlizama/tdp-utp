/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem05;

/**
 * Construya un arreglo de nombre c de 2x6, cárguelo de tal manera que cada 
 * elemento de sus tres primeras columnas almacenen el valor 1 y el resto de 
 * sus columnas el valor -1.
 * Muestre el arreglo.
 * 
 * @author LAB-USR-AQ265-A0106
 */
public class Ap02 {
    public static void main(String[] args) {
        int col = 6, fil = 2;
        int [][] c = new int[col][fil];
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fil; j++) {
                if (i < 3)
                  c[i][j] = 1;
                else
                  c[i][j] = -1;  
            }
        }
        
        for (int i = 0; i < fil; i++) {
            System.out.print("[ ");
            for (int j = 0; j < col; j++) {
                System.out.print(c[j][i] + " ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }
}
