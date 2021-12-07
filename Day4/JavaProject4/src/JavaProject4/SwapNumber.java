package JavaProject4;
import java.util.*;
public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping a="+a+"\tb="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Before swapping a="+a+"\tb="+b);
	}

}
