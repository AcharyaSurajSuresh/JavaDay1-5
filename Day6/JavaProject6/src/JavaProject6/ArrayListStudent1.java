package JavaProject6;
import java.util.*;
public class ArrayListStudent1 {

	public static void main(String[] args) {
		ArrayList<Student1> list=new ArrayList<>();
		Student1 s1=new Student1("suraj","present");
		Student1 s2=new Student1("abc","present");
		Student1 s3=new Student1("xyz","absent");
		Student1 s4=new Student1("abd","present");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		for(Student1 s:list)
		{
			System.out.println(s.name+" "+s.attendence);
		}
		
	}

}
class Student1{
	String name,attendence;

	public Student1(String name, String attendence) {
		this.name = name;
		this.attendence = attendence;
	}
	
	
}
