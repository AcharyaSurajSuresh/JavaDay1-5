package JavaProject7;
import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "abcde");
		System.out.println(map);
		
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(4, "abc");
		map1.put(4, "xyz");
		map1.put(4, "abcde");
		System.out.println(map1);
		
		HashMap<String,String> map2=new HashMap<>();
		map2.put("", "abc");
		map2.put("", "xyz");
		map2.put("1", "abcde");
		System.out.println(map2);
		
	}

}
