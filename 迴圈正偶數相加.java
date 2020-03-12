/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業;

import java.util.Scanner;
public class 迴圈正偶數相加 {

 public static void main(String[] args){
  // TODO Auto-generated method stub
  Scanner sc =  new Scanner(System.in);
   int total=0;
   int n;
   do{
    System.out.print("請輸入 n 的值( n > 0，且為偶數):");
    n = sc.nextInt();
     if(n%2==0 && n>6){
      break;
     } 
   }while(true);
   for(int i=2;i<=n;i+=2){
    total += i;
   }
   System.out.print("2+4+6..+"+n+"="+total);
 }

}