package JavaProject3;
import java.util.*;
public class Student {
	String name;
	int rollNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Suraj");
		s1.setRollNo(10);
		System.out.println(s1.getName()+" "+s1.getRollNo());
	}
	
}
