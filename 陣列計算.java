/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業;

import java.util.*;

public class 陣列計算
 {

    public static void main(String[] args) {
        int i, sum = 0;
        int[] score = new int[11];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (i = 1; i <= 10; i++) {
            System.out.print("輸入第" + i + "個整數: ");
            score[i] = sc.nextInt();
        }

        for (i = 1; i <= 10; i++) {
            System.out.println("第" + i + "個整數 " + score[i]);
            sum = sum + score[i];
        }
        System.out.println("總合為= " + sum);
        System.out.println("平均值為 = " + sum / 10);
        System.out.print("大於60: ");
        for (i = 1; i <= 10; i++) {
            if (score[i] > 60) {
                System.out.print(i + ",");
            }

        }
    }
}
