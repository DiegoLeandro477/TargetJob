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
        
        StringBuilder invert = new StringBuilder(pay).reverse();
        
        System.out.println(invert.toString());
        
        sc.close();
    }
}
