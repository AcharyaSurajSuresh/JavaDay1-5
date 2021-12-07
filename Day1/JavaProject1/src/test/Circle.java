package test;
import java.util.*;
public class Circle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double area,r;
		System.out.println("enter the radius");
		r=sc.nextDouble();
		area=3.14*r*r;
		System.out.println("area of the circle is: "+area);
	}

}
