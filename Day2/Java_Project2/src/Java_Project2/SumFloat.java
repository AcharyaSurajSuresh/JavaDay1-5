package Java_Project2;
import java.util.*;
public class SumFloat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 decimal number");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		SumFloat sf=new SumFloat();
		sf.sum(a,b);
 
	}
	void sum(float a,float b)
	{
		float s;
		s=a+b;
		System.out.println("sum is: "+s);
	}
	

}
