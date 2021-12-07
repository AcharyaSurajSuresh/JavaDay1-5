package Java_Project2;
import java.util.*;
public class Calculator1 {
	 public static void main(String aa[])
	    {
	        char choice;
	        Scanner scan=new Scanner(System.in);  
	        do {
	        System.out.print("Enter first no");
	        int ch1= scan.nextInt();
	        System.out.print("Enter second no");
	        int ch2= scan.nextInt(); 
	        System.out.print("Select your operation :\n1.Addition\n2.Sub\n3.Mul\n4.Div");
	        int op=scan.nextInt();
	        if(op==1)
	        {
	            System.out.print("Addition :"+(ch1+ch2));
	        }
	        else if(op==2)
	        {
	            System.out.print("Subtraction :"+(ch1-ch2));
	        }
	        else if(op==3)
	        {
	            System.out.print("Mul :"+(ch1*ch2));
	        }
	        else if(op==4)
	        {
	            System.out.print("Division :"+(ch1/ch2));
	        }else
	        {
	 
	            System.out.print("Enter valid choice(1,2,3,4)");
	        }
	        System.out.print("Do you want to continue?(y/n)");
	        choice=scan.next().charAt(0);
	        }
	        while(choice=='y' || choice=='Y');
	        System.out.print("Thankyou!!!");
	}

}
