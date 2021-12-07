package JavaProject3;
import java.util.*;
public class Triangle {

	int a=3,b=4,c=5;
	
	public static void main(String[] args) {
		Triangle t1=new Triangle();

	}
	Triangle()
	{
		double per=a+b+c,area;
		System.out.println("Perimeter of Triangle: "+per);
		double p=(a+b+c)/2;
		double sum=p*(p-a)*(p-b)*(p-c);
		area=Math.sqrt(sum);
		System.out.println("Area of Triangle is: "+area);
	}
	
}
