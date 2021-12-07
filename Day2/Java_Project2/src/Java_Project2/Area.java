package Java_Project2;
import java.util.*;
public class Area {

	public static void main(String[] args) {
		Area a=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n1:Circle\n2:Rectangle\n3:Square");
	    int ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:
	    {
	    	System.out.println("Enter the radius of Circle");
	    	int r=sc.nextInt();
	    	a.circle(r);
	    }
	       break;
	    case 2:
	    	{
	    		System.out.println("Enter the length and breath of Rectangle");
		    	int l=sc.nextInt();
		    	int b=sc.nextInt();
		    	a.rectangle(l,b);
	    	}
	    	break;
	    case 3:
	    {
    		System.out.println("Enter the length of Square");
	    	int l=sc.nextInt();
	    	a.square(l);
    	}
	    break;
	    default:System.out.println("Invalid option");
	    	
	    }

	}
	void circle(int r)
	{
		double area=3.14*r*r;
		System.out.println("area of the circle is: "+area);
	}
	void rectangle(int l,int b)
	{
		int area=l*b;
		System.out.println("area of the circle is: "+area);
	}
	void square(int l)
	{
		int area=l*l;
		System.out.println("area of the circle is: "+area);
	}

}
