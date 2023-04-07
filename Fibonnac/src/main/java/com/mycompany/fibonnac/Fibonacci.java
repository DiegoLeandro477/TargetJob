/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonnac;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Digite um número: ");
        Integer n = sc.nextInt();
        
        Integer[] number = {0, 1, 1};
        
        for (int i = 0; i< n; i++) {
            number[2] = number[0] + number[1];
            if (number[2] <= n){
                if (number[2].equals(n)){
                    System.out.println("O numero " + n + " pertence a sequência fibonacci: somando["+number[0]+"," + number[1]+"]");
                    break;
                }
            }else{
                System.out.println("O numero "+ n + " não pertence a lista fibonace");
                break;
            }
            number[0] = number[1];
            number[1] = number[2];
                    
        }
        
        sc.close();
    }
}
