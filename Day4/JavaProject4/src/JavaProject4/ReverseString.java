package JavaProject4;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		String str="Hello";
		char ch;
		System.out.println("Reverse of the Strig is:");
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			ch=str.charAt(i);
			System.out.print(ch);
		}
	}

	

}
