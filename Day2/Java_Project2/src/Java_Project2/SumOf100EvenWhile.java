package Java_Project2;

public class SumOf100EvenWhile {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		while(i<=100)
		{
			if(i%2==0)
				sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
