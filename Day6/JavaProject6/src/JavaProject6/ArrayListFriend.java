package JavaProject6;
import java.util.*;
public class ArrayListFriend {

	public static void main(String[] args) {
		ArrayList<Friend> list=new ArrayList<>();
		Friend f1= new Friend("ranjith","ranju","9987654321");
		Friend f2= new Friend("prajwal","pachu","9955554321");
		Friend f3= new Friend("abc","xyz","9987651111");
		list.add(f1);
		list.add(f2);
		list.add(f3);
		for(Friend ab:list)
		{
			System.out.println(ab.fname+" "+ab.nickName+" "+ab.contact);
		}

	}

}

class Friend{
	String fname,nickName,contact;

	public Friend(String fname, String nickName, String contact) {
		super();
		this.fname = fname;
		this.nickName = nickName;
		this.contact = contact;
	}
	
}