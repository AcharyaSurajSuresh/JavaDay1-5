package JavaProject5;

import java.util.Scanner;

public class ArraySum1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("enter the element of array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println("sum is: "+sum);
	}

}
