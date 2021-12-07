package JavaProject4;
import java.util.*;
public class CharacterVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 character string");
		String str=sc.next();
		char ch;
		int len=str.length(),count=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				count++;	
		}
		System.out.println(count);
	}
	
}
