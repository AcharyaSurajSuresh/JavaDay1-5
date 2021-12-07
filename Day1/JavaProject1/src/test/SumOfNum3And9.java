package test;

public class SumOfNum3And9 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%3==0 && i%9==0)
				sum=sum+i;
		}
		System.out.println(sum);
	}

}
