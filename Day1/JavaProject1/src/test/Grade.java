package test;
import java.util.*;
public class Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a marks out of 600");
		int mark=sc.nextInt();
		if(mark<=200)
			System.out.println("failed");
		
		else if(mark>200 && mark<=300)
			System.out.println("C grade");
		
		else if(mark>300 && mark<=450 )
			System.out.println("B grade");
		
		else
			System.out.println("A grade");
	}

}
