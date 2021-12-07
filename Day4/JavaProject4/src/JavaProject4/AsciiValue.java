package JavaProject4;
import java.util.*;
public class AsciiValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ascii value from A-Z");
		char ch='A';
		for(int i='A';i<='Z';i++)
		{
			int value=ch;
			System.out.println("Ascii value of "+ch+" is :"+value);
			ch++;
		}
	}

}
