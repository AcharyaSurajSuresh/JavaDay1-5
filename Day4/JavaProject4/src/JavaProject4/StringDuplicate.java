package JavaProject4;
import java.util.*;
public class StringDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		
     	}
		System.out.println(count);
	}
}
