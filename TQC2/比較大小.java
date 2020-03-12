/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業.TQC2;

/**
 *
 * @author user
 */
import java.util.*;

public class  比較大小 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
    }

    static void test() {
        int num1, num2;

        System.out.println("輸入:");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " 大於 " + num2);
        }
        else {
            System.out.println(num2+ " 大於 " + num1);
        }
    }
}