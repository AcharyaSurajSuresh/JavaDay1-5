package test;
import java.util.*;
public class Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		System.out.println("enter 5 number");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			sum=arr[i]+sum;
		}
		int avg=sum/5;
		System.out.println("Average of 5 number is:"+avg);
}
}
