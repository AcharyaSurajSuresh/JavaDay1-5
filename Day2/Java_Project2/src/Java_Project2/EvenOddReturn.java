package Java_Project2;
import java.util.*;
public class EvenOddReturn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		EvenOddReturn e=new EvenOddReturn();
		String evenOdd=e.even(n);
		System.out.println("Number is "+evenOdd);
	}
	String even(int x)
	{
		if(x%2==0)
			return "Even";
		else
			return "Odd";
	}
	

}

