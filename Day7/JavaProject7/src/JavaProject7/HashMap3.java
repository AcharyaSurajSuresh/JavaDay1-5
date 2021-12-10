package JavaProject7;
import java.util.*;
public class HashMap3 {

	public static void main(String[] args) {
		HashMap<String,Books1> map=new HashMap<>();
		Books1 b1=new Books1("abc ",1,500);
		Books1 b2=new Books1("xyz ",2,1500);
		Books1 b3=new Books1("mnop",3,1100);
		
		map.put("book1", b1);
		map.put("book2", b2);
		map.put("book3", b3);
		
		for(Map.Entry<String,Books1> me:map.entrySet())
		{
			System.out.println(me.getKey()+" : "+me.getValue().name+" "+me.getValue().id+" "+me.getValue().price);
		}

	}

}
class Books1{
	String name;
	int id,price;
	public Books1(String name, int id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
}