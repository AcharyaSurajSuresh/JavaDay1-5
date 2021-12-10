package JavaProject7;
import java.util.*;
public class HashMap4 {

	public static void main(String[] args) {
		HashMap<String,Employee1> map=new HashMap<>();
		Employee1 e1=new Employee1("Raju",1,30000);
		Employee1 e2=new Employee1("wxyz",2,20000);
		Employee1 e3=new Employee1("abcd",3,35000);
		
		map.put("Emp1", e1);
		map.put("Emp2", e2);
		map.put("Emp3", e3);
		for(Map.Entry<String, Employee1> me:map.entrySet())
		{
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
	}

}
class Employee1{
	String name;
	int id;
	double salary;
	public Employee1(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String toString()
	{
		return name+" "+id+" "+salary;
	}
	
}