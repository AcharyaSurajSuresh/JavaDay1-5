package JavaProject5;

import java.util.Scanner;

public class ArraysString1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array String ");
		int n=sc.nextInt();
		System.out.println("enter the element of array String");
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);

		}
	}

}
