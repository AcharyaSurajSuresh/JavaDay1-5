package JavaProject5;
import java.util.*;
public class Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number  to divide by zero ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			try {
				if(i==n)
				{
					i=i/0;
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception in code: "+e);
			}
			System.out.println(i);
		}

	}

}
