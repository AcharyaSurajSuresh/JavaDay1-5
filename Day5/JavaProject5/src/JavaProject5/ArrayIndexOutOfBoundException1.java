package JavaProject5;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,4,6,8,9};
		System.out.println("enter index number to get number");
		int n=sc.nextInt();
		try {
			System.out.println(arr[n]);
		}
		catch(Exception e)
		{
			System.out.println("Exception is : "+e);
		}
	}

}
