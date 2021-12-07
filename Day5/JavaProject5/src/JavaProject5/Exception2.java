package JavaProject5;
import java.util.*;
public class Exception2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string of 5 character");
		String str=sc.next();
		try {
		System.out.println(str.charAt(6));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
