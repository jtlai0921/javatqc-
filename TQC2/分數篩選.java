/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業.TQC2;
import java.util.Scanner;

public class 分數篩選
 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
    }

    static void test() {

        int score;

        System.out.println("輸入分數:");
        score = keyboard.nextInt();

        if (score >= 60) {
            //分數判斷結果為及格
            System.out.println("及格");
        }

        System.out.println("不及格");
    }
}