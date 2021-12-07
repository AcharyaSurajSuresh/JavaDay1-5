package JavaProject5;
import java.util.*;
public class NullPointerException1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=null;
		System.out.println("enter index number to get character");
		int n=sc.nextInt();
		try {
			System.out.println(str.charAt(n));
		}
		catch(Exception e)
		{
			System.out.println("Exception is : "+e);
		}
	}

}
