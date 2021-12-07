package JavaProject5;
import java.util.*;
public class ArithmeticException1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int div;
		try {
			div=a/b;
			System.out.println(a+" divide "+b+" is : "+div);
		}
		catch(Exception e)
		{
			System.out.println("divide by zero error: "+e);
		}
	}

}
