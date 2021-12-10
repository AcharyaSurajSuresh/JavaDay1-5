package JavaProject6;

import java.util.*;

public class ArrayListIntegerString {

	public static void main(String[] args) {
		System.out.println("ARRAYS");
		System.out.println("--------------------------------------------------");
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1200);
		list.add(2200);
		list.add(1400);
		list.add(5200);
		
		System.out.println(list+"\n");
		for(Integer x:list)
		{
			System.out.println(x);
		}
		System.out.println("\nSTRINGS");
		System.out.println("--------------------------------------------------");
		ArrayList<String> str=new ArrayList<>();
		str.add("suraj");
		str.add("abc");
		str.add("xyz");
		str.add("ab123");
		
		
		System.out.println(str+"\n");
		for(String x:str)
		{
			System.out.println(x);
		}
	}

}
