package JavaProject6;

import java.util.ArrayList;

public class ArrayLIstEmployee1 {

	public static void main(String[] args) {
		ArrayList<Employee1> list=new ArrayList<>();
		Employee1 e1=new Employee1("suraj","10");
		Employee1 e2=new Employee1("abc","20");
		Employee1 e3=new Employee1("hello","40");
		Employee1 e4=new Employee1("xyz","30");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		for(Employee1 e:list)
		{
			System.out.println(e.getName()+" "+e.getId());
		}
//		for(Employee1 e:list)
//		{
//			System.out.println(e);
//		}
	}

}
class Employee1{
	String name,id;

	
	public Employee1(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
//	public String toString() {
//		return "Name:"+name+"\nId:"+id;
//	}
	
}