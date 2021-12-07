package Java_Project2;

import java.util.Scanner;

public class FactorialMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number f");
		int n=sc.nextInt();
		FactorialMethod f=new FactorialMethod();
		f.factorial(n);
	}
	void factorial( int x) {
		int fact=1;
		int i=1;
		while(i<=x)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of "+x+" is "+fact);
	}

}
