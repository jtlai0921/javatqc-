/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業.TQC2;

import java.util.*;

public class 倍數判斷 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }

    static void test() {
        int num;

        System.out.println("Enter an integer:");
        num = keyboard.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println(num + "是2、3、6的倍數");
        }
        else if (num % 2 == 0) {
            System.out.println(num + "是2的倍數");
        }
        else if (num % 3 == 0) {
            System.out.println(num + "是3的倍數");
        }
        else {
            System.out.println(num + "不是2、3、6的倍數");
        }
    }
}