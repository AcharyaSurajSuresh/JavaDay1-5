package Java_Project2;
import java.util.*;
public class BillForOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n1:Breakfast\n2:Lunch\n3:Dinner");
		int ch=sc.nextInt();
		char ck;
		switch(ch)
		{
		case 1:{
			int sum=0;
			
			do
			{
				System.out.println("Order the breakfast:\n1.Dosa=Rs.30\n2:Palav=Rs35\n3:tea=Rs20");
				int chb=sc.nextInt();
				
				if(chb==1)
					sum=sum+30;
				else if(chb==2)
					sum=sum+35;
				else if(chb==3)
					sum=sum+20;
				else
					System.out.println("Invalid choice");
				System.out.print("Order more:(yes||no)");
				ck=sc.next().charAt(0);
							
		     }while(ck=='y'||ck=='Y');
			System.out.println("Bill is: "+sum);
		
		}
		break;
		case 2:{
			int sum=0;
			do
			{
				System.out.println("Order the Lunch:\n1.Full Meal=Rs.60\n2:Fried Rice=Rs50\n3:Juice=Rs25");
				int chl=sc.nextInt();
				
				if(chl==1)
					sum=sum+30;
				else if(chl==2)
					sum=sum+35;
				else if(chl==3)
					sum=sum+20;
				else
					System.out.println("Invalid choice");
				System.out.print("Order more:(yes||no)");
				ck=sc.next().charAt(0);
							
		     }while(ck=='y'||ck=='Y');
			System.out.println("Bill is: "+sum);
		}
		break;
		case 3:{
			int sum=0;
			do
			{
				System.out.println("Order the Dinner:\n1.Full Meal=Rs.60\n2:Dosa=Rs30\n3:Juice=Rs25");
				int chd=sc.nextInt();
				
				if(chd==1)
					sum=sum+30;
				else if(chd==2)
					sum=sum+35;
				else if(chd==3)
					sum=sum+20;
				else
					System.out.println("Invalid choice");
				System.out.print("Order more:(yes||no)");
				ck=sc.next().charAt(0);
							
		     }while(ck=='y'||ck=='Y');
			System.out.println("Bill is: "+sum);
		}
		break;
		}

	}

}
