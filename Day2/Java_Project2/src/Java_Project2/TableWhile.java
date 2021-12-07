package Java_Project2;
import java.util.*;
public class TableWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(n+" * "+i+" = "+n*i);
			i++;
		}

	}

}
