/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業;
import java.util.Scanner;

public class 數學函數 {
public static void main(String[] args) {
String 函數;
double x;
double y;

Scanner sc = new Scanner(System.in);
System.out.println("f(x)=3*x^3+2*x-1 ");
System.out.println("請輸入x值 : ");

x = sc.nextDouble();

y =3*(x*x*x)+2*x-1;
System.out.println("函數f("+ x +")=" + y );
}
}