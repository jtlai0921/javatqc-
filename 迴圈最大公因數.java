/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業;

import java.util.Scanner;

public class 迴圈最大公因數 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("輸入兩數:"); 
        System.out.print("m = "); 
        int m = scanner.nextInt();
        System.out.print("n = "); 
        int n = scanner.nextInt();
        System.out.println("最大公因數: " + gcd(m, n)); 
    } 

    private static int gcd(int m, int n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}