package JavaProject5;
import java.util.*;
public class MultipleCatch1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		String str=null;
		int sum;
		try {
			sum=n/0;
			System.out.println(str.charAt(n));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic \n"+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer \n"+e);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("NullPointer \n"+e);
		}
	}

}
