package Java_Project2;
import java.util.*;
public class Sum100Return {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sum100Return s=new Sum100Return();
		int sum=s.sumNumber();
		System.out.println(sum);
	}
	int sumNumber() {
		int num=0;
		for(int i=1;i<=100;i++)
		{
			num=num+i;
		}
		return num;
	}
	
	
}
