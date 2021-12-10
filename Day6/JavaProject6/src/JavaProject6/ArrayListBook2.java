package JavaProject6;
import java.util.*;
public class ArrayListBook2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Bookname,author;
		int id,price;
		ArrayList<Books1> list=new ArrayList<>();
		System.out.println("Enter the no of book");
		int n=sc.nextInt();
		String Bookname1=null,author1=null;
		int id1=0;price=0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter bookname,id,price,author for book "+i);
			Bookname1=sc.next();
			id1=sc.nextInt();
			price=sc.nextInt();
			author1=sc.next();
			Books1 b1=new Books1(Bookname1,id1,price,author1);
			list.add(b1);
		}
		for(Books1 b:list)
		{
			System.out.println(b.Bookname1+" "+b.id1+" "+b.price+" "+b.author1);
		}
		
	}

}
class Books1{
	String Bookname1,author1;
	int id1,price;
	public Books1(String bookname, int id, int price, String author) {
		super();
		Bookname1 = bookname;
		this.id1 = id;
		this.price = price;
		this.author1 = author;
	}
}












//public class Book {



//public static void main(String[] args) {
//// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);
//String name = null;int id = 0,price = 0;String author = null;
//ArrayList<Books> list=new ArrayList<>();
//System.out.println("enter number of book");
//int n=sc.nextInt();
//for(int i=0;i<n;i++){
//System.out.println(" enter the name,id,price,author of book");
//name=sc.next();
//
//id=sc.nextInt();
//price=sc.nextInt();
//author=sc.next();
//Books s=new Books(name,id,price,author);
//list.add(s);
//
//}
//
//
//
//System.out.println("name\t id 1\t price \t author \t");
//for(Books s:list) {
//System.out.println(s.name+" \t"+s.id+"\t "+s.price+" \t"+s.author);
//}
//}
//
//
//
//}
//class Books{
//String name;int id,price;String author;
//public Books(String name,int id,int price,String author) {
//super();
//this.name=name;
//this.id=id;
//this.price=price;
//this.author=author;
//}
//}