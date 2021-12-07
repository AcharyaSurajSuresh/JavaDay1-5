package test;
import java.util.*;
public class Rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and breath");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		Rectangle r=new Rectangle();
		double area=r.Rectangle(l,b);
		System.out.println("area is "+area);	
}
	double Rectangle(double a,double b) {
		double ar=a*b;
		return ar;
	}
}