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

public class 判斷奇偶數 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    static void test() {
        int num;
        System.out.println("Input an integer:");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}