/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.utp.sem04;

/**
 *
 * @author LAB-USR-AQ265-A0106
 */
public class Semana04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int ar[][] = {{15,13,8},{12,21,46}};
//        
//        System.out.println(">" + ar[1][2]);
        int len= 15;
        int n[]= new int[len];
        for (int i = 0; i < len; i++) {
            n[i]=i*3;
        }
        
        for (int i = 0; i < len; i++) {
            System.out.println(n[i]);
        }
    }
    
}
