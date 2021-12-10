package JavaProject6;
import java.util.*;
public class ArrayListBook1 {

	public static void main(String[] args) {
		ArrayList<Books> list=new ArrayList<>();
		Books b1=new Books("abc",10,1000,"abcde");
		Books b2=new Books("xyz",20,1500,"wxyz");
		Books b3=new Books("hi",30,2500,"hello");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(Books b:list)
		{
			System.out.println(b.Bookname+" "+b.id+" "+b.price+" "+b.author);
		}
		
	}

}
class Books{
	String Bookname,author;
	int id,price;
	public Books(String bookname, int id, int price, String author) {
		super();
		Bookname = bookname;
		this.id = id;
		this.price = price;
		this.author = author;
	}
}
