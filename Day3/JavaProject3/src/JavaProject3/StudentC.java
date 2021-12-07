package JavaProject3;

public class StudentC {

	public static void main(String[] args) {
		StudentC sc1=new StudentC();
		StudentC sc2=new StudentC("Suraj");

	}
	StudentC()
	{
		String name1="Unknown";
		System.out.println(name1);
	}
	StudentC(String str)
	{
		String name2=str;
		System.out.println(name2);
	}

}
