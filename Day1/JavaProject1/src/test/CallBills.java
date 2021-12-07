package test;
import java.util.*;
public class CallBills {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a call");
		int n=sc.nextInt();
		int bill=0;//350=100(250)=(100*1)(100*2)(50*3)
		if(n<=100)//250=(100)(100*1)(50*2)=200
		   System.out.println("no bills");
		else if(n>101 && n<=200)
		{
			bill=(n-100)*1;
			System.out.println(bill+" call bills");																																																
		}
		else if(n>201 && n<=300) 
		{
			bill=(n-200)*2+100;
			System.out.println(bill+" call bills");		
		}
		else
		{
			bill=(n-300)*3+200+100;
			System.out.println(bill+" call bills");		
		}
			
	}
}
