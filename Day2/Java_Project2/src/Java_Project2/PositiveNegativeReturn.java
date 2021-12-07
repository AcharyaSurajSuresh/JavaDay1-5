package Java_Project2;

import java.util.Scanner;

public class PositiveNegativeReturn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		PositiveNegativeReturn e=new PositiveNegativeReturn();
		String Positive=e.even(n);
		System.out.println("Number is "+Positive);
	}
	String even(int x)
	{
		if(x>=0)
			return "Positive";
		else
			return "Negative";
	}

}
