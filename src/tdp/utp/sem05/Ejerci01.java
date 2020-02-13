/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AQ265-A0106
 */
public class Ejerci01 {
    public static void main(String[] args) {
        int col = 3, fil = 2;
        String [][] nombres = new String[col][fil];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fil; j++) {
                System.out.print("Ingrese el valor de la pocision [" + i + "," + j + "]: ");
                nombres[i][j] = sc.next();
            }
        }
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fil; j++) {
                System.out.println("[" + i + "," + j + "]: " + nombres[i][j]);
            }
        }
    }
}
