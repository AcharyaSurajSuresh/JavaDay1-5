package Java_Project2;
import java.util.*;
public class changeVariable {
	static int i=9;

	public static void main(String[] args) {
		int i=10;
		changeVariable c1=new changeVariable();
		changeVariable c2=new changeVariable();
		changeVariable c3=new changeVariable();
		System.out.println(i);
		c1.changeVar();
		System.out.println(c1.i);
		System.out.println(c2.i);
		System.out.println(c3.i);		
		
	}
	void changeVar()
	{
		int i=30;
	}
}
