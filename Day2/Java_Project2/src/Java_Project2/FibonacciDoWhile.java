package Java_Project2;

public class FibonacciDoWhile {
	public static void main(String[] args) {
		int n=20;
		int fib1=0,fib2=1,fib3;
		if(n==1)
			System.out.println(fib1+"\t");
		else if(n==2)
			System.out.println(fib1+"\t"+fib2);
		else
		{
			System.out.print(fib1+"\t"+fib2+"\t");
			int i=3;
			do
			{
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
				System.out.print(fib3+"\t");
				i++;
			}while(i<=n);
		}
	}

}
