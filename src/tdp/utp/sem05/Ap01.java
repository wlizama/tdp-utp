/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem05;

import java.util.Scanner;

/**
 * Construya un arreglo 3 x 3 cárguelo con valores numéricos enteros y obtenga 
 * la suma de sus diagonales.
 * 
 * @author LAB-USR-AQ265-A0106
 */
public class Ap01 {
    public static void main(String[] args) {
        int col = 3, fil = 3;
        int [][] nums = new int[col][fil];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fil; j++) {
                System.out.print("Ingrese el número posicion[" + i + "," + j + "]: ");
                nums[i][j] = sc.nextInt();
            }
        }
        
        double sumx1 = 0;
        int contj1 = 0;
        for (int i = 0; i < col; i++) {
            sumx1 += nums[i][contj1];
            contj1++;
        }
        
        double sumx2 = 0;
        int contj2 = fil-1;
        for (int i = 0; i < col; i++) {
            sumx2 += nums[i][contj2];
            contj2--;
        }
        
        System.out.println("sum X1=" + sumx1);
        System.out.println("sum X2=" + sumx2);
    }
}
