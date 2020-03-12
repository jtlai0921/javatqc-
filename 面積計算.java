/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class 面積計算 {




public static void main(String[] args) {

Scanner input = new Scanner(System.in);






System.out.println("請輸入圓的半徑");

double a = input.nextDouble();




double area = a * a * 3.1415926;




System.out.println("半徑=" + a + "半徑=" + a + "的圓形面積為"

+ area);




System.out.println("請輸入三角形的的底");

double c = input.nextDouble();

System.out.println("請輸入三角形的高");

double d = input.nextDouble();

double area2 = (c * d) / 2;




System.out.println("長=" + c + "寬=" + d + "的三角形面積為"

+ area2);




System.out.println("請輸入長方形的長");

double e = input.nextDouble();

System.out.println("請輸入長方形的寬");

double f = input.nextDouble();

double area3 = e * f;




System.out.println("長=" + e + "寬=" + f + "的方形面積為"

+ area3);




double area4 = area + area2 + area3;

System.out.println("圓形面積為=" + area + "三角形面積為=" + area2 + "的方形面積為"

+ area3 + "總面積為"

+ area4);






}




}