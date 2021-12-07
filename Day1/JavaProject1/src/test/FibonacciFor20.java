package test;

import java.util.Scanner;

public class FibonacciFor20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=20;
		int fib1=0,fib2=1,fib3;
		if(n==1)
			System.out.println(fib1+"\t");
		else if(n==2)
			System.out.println(fib1+"\t"+fib2);
		else
		{
			System.out.print(fib1+"\t"+fib2+"\t");
			for(int i=3;i<=n;i++) {
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
				System.out.print(fib3+"\t");
			}
		}

	}
}
