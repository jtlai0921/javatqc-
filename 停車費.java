package 作業;

import java.util.Scanner;

public class 停車費 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入停車時間?小時: ");
        int i, price;
        i = sc.nextInt();
        if (i < 2 & i==2) {

            price = i*30;
            System.out.println(i + "小時為" + price + "元");
        } 
        if (i>2&i < 4) {

            price = i*50;
            System.out.println(i + "小時為" + price + "元");
        } 
        if (i>=4||i < 6) {

            price = i*80;
            System.out.println(i + "小時為" + price + "元");
        } 
       if (i>=6) {

            price = i*100;
            System.out.println(i + "小時為" + price + "元");
        }  
        
}
}