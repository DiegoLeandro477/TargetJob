/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringinvert;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class StringInvert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Digite aqui: ");
        String pay = sc.nextLine();
        
        char[] chars = pay.toCharArray();
        char[] invert = new char[pay.length()];
        
        // inverte a string trocando os caracteres
        for (int i = 0; i<pay.length(); i++){
            invert[i] = chars[pay.length() - 1 - i];
        }
        
        System.out.println(new String(invert));
        
        sc.close();
    }
}
