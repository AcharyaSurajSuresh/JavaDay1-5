package JavaProject7;
import java.util.*;
import java.util.Map.Entry;

public class HashMap5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=null,class1=null;
		int id=0;
		HashMap<Integer,Teacher> map=new HashMap<>();
		System.out.println("enter the number of Teacher details");
		int n=sc.nextInt();
		int key=1;
		for(int i=0;i<n;i++)
		{

			System.out.println("enter name,id,class"+i);
		    name=sc.next();
			id=sc.nextInt();
			class1=sc.next();
			Teacher t1=new Teacher(name,id,class1);
			map.put(key, t1);
			key++;
		}
		for(Entry<Integer, Teacher> me:map.entrySet())
		{
			System.out.println(me.getKey()+":"+me.getValue().name+" "+me.getValue().id+" "+me.getValue().class1);
		}
	}

}
class Teacher{
	String name,class1;
	int id;
	public Teacher(String name, int id, String class1) {
		super();
		this.name = name;
		this.id = id;
		this.class1= class1;
	}
	
}