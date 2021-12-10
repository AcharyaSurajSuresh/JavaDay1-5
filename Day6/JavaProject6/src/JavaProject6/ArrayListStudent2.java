package JavaProject6;
import java.util.*;
public class ArrayListStudent2 {
	public static void main(String[] args) {
		ArrayList<Student2> list=new ArrayList<>();
		Student2 st1=new Student2("suraj","400/500","380/500","480/500");
		Student2 st2=new Student2("abc","  300/500","280/500","380/500");
		Student2 st3=new Student2("xyz","  350/500","350/500","410/500");
		list.add(st1);
		list.add(st2);
		list.add(st3);
		for(Student2 st:list)
		{
			System.out.println(st.name+"  "+st.mark1+"  "+st.mark2+"  "+st.mark3);
		}
		
		Student2 ele=list.get(1);
		System.out.println("\ngot the value of given index number: "+ele.name+"\n");
		
		list.remove(2);
		
		for(Student2 st:list)
		{
			System.out.println(st.name+"  "+st.mark1+"  "+st.mark2+"  "+st.mark3);
		}
		
		list.removeAll(list);
		System.out.println("\nRemoved all elements: "+list);
	}

}

class Student2{
	String name,mark1,mark2,mark3;

	public Student2(String name, String mark1, String mark2, String mark3) {
		super();
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	
	
}