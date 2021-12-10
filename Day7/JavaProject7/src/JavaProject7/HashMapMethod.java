package JavaProject7;

import java.util.*;

public class HashMapMethod {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "abcde");
		System.out.println("Is Empty Method----");
		System.out.println("Is Map is Empty: "+map.isEmpty());
		map.clear();
		System.out.println("Clear Method---");
		System.out.println(map+"\n");
		System.out.println("Is Empty Method---");
		System.out.println("Is Map is Empty: "+map.isEmpty()+"\n\n");
		
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(4, "Suraj");
		map1.put(5, "Raju");
		map1.put(6, "abaaa");
		System.out.println("KeySet Method-----");
		System.out.println("the set are: "+map1.keySet());
		System.out.println(map1);
		System.out.println("\nEqual Method");
		System.out.println("map and map1 is equal:"+map.equals(map1)+"\n");
		
		
		HashMap<Integer,String> newMap=new HashMap<>();
		newMap.putAll(map1);
		System.out.println("putAll Method ----");
		System.out.println(newMap);
		System.out.println("\ncontainsKey Method------");
		System.out.println("Element is present or not:"+newMap.containsKey(4));
		System.out.println("new map is:"+newMap+"\n");
		newMap.remove(4);
		System.out.println("Remove Method-----");
		System.out.println("alternate map is:"+newMap);
		System.out.println("Element is present or not:"+newMap.containsKey(4)+"\n");
		
		HashMap<String,String> map2=new HashMap<>();
		map2.put("A", "abc");
		map2.put("B", "xyz");
		map2.put("C", "abcde");
		System.out.println("get method----");
		System.out.println("get element:"+map2.get("A"));
		System.out.println("\nreplace method----");
		System.out.println(map2);
		map2.replace("B", "hello");
		System.out.println(map2);
		System.out.println("\nsize method-----");
		System.out.println("size of map2:"+map2.size());
	}

}
