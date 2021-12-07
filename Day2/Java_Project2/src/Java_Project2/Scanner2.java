package Java_Project2;
import java.util.*;
public class Scanner2 {
	public static void main(String aa[])
    {
        Scanner scan=new Scanner(System.in);  
        System.out.print("Enter character"); 
        char ch= scan.next().charAt(0);  
        System.out.print("Enter name");
        String name=scan.next(); 
        System.out.print(name+"  , "+ch);
}
}
