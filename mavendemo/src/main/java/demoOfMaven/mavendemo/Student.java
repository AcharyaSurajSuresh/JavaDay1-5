package demoOfMaven.mavendemo;

public class Student {
	String name;
	int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	void display()
	{
		System.out.println("Name: "+name+"\nRollNo: "+rollno);
	}
}
