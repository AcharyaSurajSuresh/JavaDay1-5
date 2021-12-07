package test;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int flag=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag++;
		}
		if(flag==1)
			System.out.println(n+" is prime Number");
		else
			System.out.println(n+" is not prime Number");
	}

}
