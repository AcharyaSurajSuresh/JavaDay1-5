package JavaProject7;
import java.util.*;
import java.util.Map.Entry;
public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Suraj");
		map.put(2, "xyz");
		map.put(3, "abc");
		map.put(4, "abcde");
		System.out.println(map+"\n");
		
		for(Map.Entry<Integer,String> me:map.entrySet())
		{
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		HashMap<String,Integer> map1=new HashMap<>();
		map1.put("java", 79);
		map1.put("php", 60);
		map1.put("andriod", 90);
	
		System.out.println("\n"+map1+"\n");
		
		for(Map.Entry<String,Integer> me1:map1.entrySet())
		{
			System.out.println(me1.getKey()+" : "+me1.getValue());
		}
		
		HashMap<String,String> map2=new HashMap<>();
		map2.put("color1", "red");
		map2.put("color2", "black");
		map2.put("color3", "pink");
		
		System.out.println("\n"+map2+"\n");
		
		for(Map.Entry<String, String> me2:map2.entrySet())
		{
			System.out.println(me2.getKey()+" : "+me2.getValue());
		}
	}

}
