package test;
import java.util.*;
public class BillElectricity {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a unit");
		int n=sc.nextInt();
		int bill=0;
		if(n<=50)   //200=(50*0)(50*6)(50*8)(50*9)
		   System.out.println("no bills");
		else if(n>51 && n<=100)
		{
			bill=(n-50)*6;
			System.out.println("Rs "+bill+" Electricity bills");																																																
		}
		else if(n>51 && n<=100)
		{
			bill=(n-50)*6;
			System.out.println("Rs "+bill+" Electricity bills");																																																
		}
		else if(n>101 && n<=150)
		{
			bill=(n-100)*8+(50*6);
			System.out.println("Rs "+bill+" Electricity bills");																																																
		}
		else 
		{
			bill=(n-150)*9+(50*8)+(50*6);
			System.out.println("Rs "+bill+" Electricity bills");																																																
		}
	}

}
