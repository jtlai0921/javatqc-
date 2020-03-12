package 作業;

import java.io.*;
public class 費式數列
 {

    public static void main(String args[])throws IOException {
     	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
     	System.out.print("請輸入費氏數列項數m：");
     	int m=Integer.parseInt(buf.readLine());
     	System.out.println("費氏數列第"+m+"項數的值為"+fib(m));
    }
    
    public static long fib(int n){
        if(n==1)
		return 1;
	else if (n==2)
		return 1;
	else
		return fib(n-1)+fib(n-2); 
    }   
}