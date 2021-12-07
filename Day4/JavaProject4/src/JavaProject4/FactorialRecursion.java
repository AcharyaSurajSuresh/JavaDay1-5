package JavaProject4;
import java.util.*;
public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FactorialRecursion f=new FactorialRecursion();
		System.out.println("enter a number");
		int a=sc.nextInt();
		int factorial=f.fact(a);
		System.out.println("Factorial of "+a+" is:"+factorial);
	}
	int fact(int x)
	{
		if(x==0)
			return 1;
		else
			return(x*fact(x-1));
	}

}
