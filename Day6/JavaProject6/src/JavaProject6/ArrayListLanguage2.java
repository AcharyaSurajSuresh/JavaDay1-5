package JavaProject6;
import java.util.*;
public class ArrayListLanguage2 {
	public static void main(String[] args) {
		ArrayList<Language2> list=new ArrayList<>();
		Language2 a1=new Language2("Java");
		Language2 a2=new Language2("Andriod");
		Language2 a3=new Language2("php");
		Language2 a4=new Language2("network");
		Language2 a5=new Language2("c++");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		System.out.println("Programming Languages :");
		for(Language2 ab:list)
		{
			System.out.println(ab.lang);
		}
		System.out.println("\n");
		list.remove(2);
		
		System.out.println("Updated Programming Languages :");
		for(Language2 ab:list)
		{
			System.out.println(ab.lang);
		}
	}
}

class Language2
{
	String lang;
	int marks;
	public Language2(String lang) {
		this.lang = lang;
	}
	
	
}