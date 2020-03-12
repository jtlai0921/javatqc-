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

class 公倍數計算 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }

    public static void test() {
        int num1;

        System.out.println("Input:");
        num1 = input.nextInt();
        if ((num1 % 5 == 0) && (num1 % 9 == 0)) {
            System.out.println("同時被 5 和 9 整除");
        }
        else {
            System.out.println("不能同時被 5 和 9 整除");
        }
    }
}