package JavaProject4;
import java.util.*;
public class PowerOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PowerOfNum p=new PowerOfNum();
		System.out.println("enter the number and power");
		int n=sc.nextInt();
		int pow=sc.nextInt();
		p.power(n,pow);
	}
	void power(int x,int y)
	{
		int total=1;
		for(int i=0;i<y;i++)
		{
			total=total*x;
		}
		System.out.println(total);
	}

}
