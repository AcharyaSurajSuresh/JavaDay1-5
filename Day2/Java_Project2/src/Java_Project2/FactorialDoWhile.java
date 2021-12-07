package Java_Project2;

import java.util.Scanner;

public class FactorialDoWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number fa");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		do
		{
			fact=fact*i;
			i++;
		}while(i<=n);
		System.out.println("factorial of "+n+" is "+fact);
	}

}
