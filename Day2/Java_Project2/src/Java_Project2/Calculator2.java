package Java_Project2;
import java.util.*;
public class Calculator2 {
	public static void main(String aa[])
    {
        String choice;
        Scanner scan=new Scanner(System.in);  
        do {
        System.out.print("Enter first no"); 
        int ch1= scan.nextInt();  //4
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
        System.out.print("Do you want to continue?(yes/no)");
        choice=scan.next();
        }
        while(choice.equals("YES")|| choice.equals("yes"));
        System.out.print("Thankyou!!!");
}

}
