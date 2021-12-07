package JavaProject3;
import java.util.*;
public class StudentInh1 {
	public static void main(String[] args) {
		Marks m=new Marks();
		m.readDetails();
		m.displayDetails();
		m.readMarks();
		m.displayMarks();

	}

}

class Student1
{
	Scanner sc=new Scanner(System.in);
	int StudentId;
	String StudentName;
	String phone;
	
	void readDetails()
	{
		System.out.println("enter a id:");
		StudentId=sc.nextInt();
		System.out.println("enter a name:");
		StudentName=sc.next();
		System.out.println("enter a phone number:");
		phone=sc.next();
	}
	void displayDetails()
	{
		System.out.println("Details are:\nStudentId: "+StudentId+"\nStudentName: "+StudentName+"\nphone: "+phone);
	}
}

class Marks extends Student1
{
	int m1,m2,m3;
	
	void readMarks()
	{
		System.out.println("Enter m1,m2,m3 marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	void displayMarks()
	{
		System.out.println("marks are:\nm1: "+m1+"\nm2: "+m2+"\nm3: "+m3);
	}
}

