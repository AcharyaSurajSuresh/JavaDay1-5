package JavaProject7;
import java.util.*;

public class ArrayList2AL {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("suraj");
		list.add("raju");
		list.add("rajesh");
		
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("abc");
		list1.add("xyz");
		list1.add("mno");
		
		ArrayList<ArrayList<String>> list2= new ArrayList<>();
		list2.add(list);
		list2.add(list1);
		System.out.println(list2);
		
	}

}











