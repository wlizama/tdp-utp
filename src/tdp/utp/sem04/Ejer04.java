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
public class Ejer04 {
    public static void main(String[] args) {
        String[] a;
        a = new String[4];
        
        a[0] = "Hola";
        a[1] = "otra";
        
        String[] b = {"a", "b", "c"};
        
        b[0] = "Chao";
        
        for (int i = 0; i < b.length; i++) {
            b[i] = "AA" + i;
        }
        
        System.out.println(a[0]);
        
        for (String s : b) {
            System.out.println(s);
        }
     }
}
