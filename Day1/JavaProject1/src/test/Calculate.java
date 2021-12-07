package test;
import java.util.*;
public class Calculate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculate Simple Interest");
		System.out.println("enter the value of p,r and t");
		int P=sc.nextInt();
		int R=sc.nextInt();
		int T=sc.nextInt();
		double SI=(P*R*T)/100;
		System.out.println("Simple Interest : "+SI);
	}

}
